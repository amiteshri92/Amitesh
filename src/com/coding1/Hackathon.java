package com.coding1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Hackathon {

	WebDriver driver=null;
	@BeforeSuite
	public void initialize(){
		System.setProperty("webdriver.gecko.driver", "D:\\softwares\\geckodriver-v0.15.0-win64\\geckodriver.exe"); //using webdriver version 3.3.1
		driver = new FirefoxDriver();
		driver.get("https://news.ycombinator.com");
	}
	
	@Test
	public void searchOperation(){
		
		// searching the text given "Hackathon"
		
		WebElement search = driver.findElement(By.name("q"));
		System.out.println("Search box located");
		search.sendKeys("Hackathon");
		search.sendKeys(Keys.ENTER);
		
		//Marking external wait for SearchBar on results page
		WebDriverWait searchResult = new WebDriverWait(driver,100);
		searchResult.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='item-input-wrapper ng-scope']")));
		WebElement searchBar = driver.findElement(By.xpath("//*[@class='item-input-wrapper ng-scope']"));
		Assert.assertTrue(searchBar.isEnabled());
	}
	
	@Test(dependsOnMethods="searchOperation")
	public void countPoints(){
		
			for(int k=0;k<5;k++){  //Loop to execute till 5th page
				
				List<String> lstring = new ArrayList<String>();
				
				//Taking a linkedhashmap to maintain mapping between points and title, title as a key and points as value
				Map<String,String> mp = new LinkedHashMap<String,String>();
				
				WebDriverWait searchResult = new WebDriverWait(driver,300);
				searchResult.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='item-infos list-inline']//span[contains(text(),'points')]")));
				List<WebElement> points = driver.findElements(By.xpath("//*[@class='item-infos list-inline']//span[contains(text(),'points')]"));
				List<WebElement> titles = driver.findElements(By.xpath("//*[@class='item-title-and-infos']/h2/a"));
				
				//Size of the points on current page
				System.out.println("points : "+points.size());
				
				//points and titles against them 
				for(int i=0;i<points.size();i++){
					System.out.print(points.get(i).getText()+" : ");
					System.out.println(titles.get(i).getText());
					mp.put(titles.get(i).getText(), points.get(i).getText());
				}
				
				Set<Entry<String,String>> set =mp.entrySet();
				List<Entry<String,String>> lstset =new ArrayList<Entry<String,String>>(set);
				
				for(Entry entry : lstset){
					
					String s = (String) entry.getValue(); //Gives complete text i.e. "424 points"
					String[] str = new String[2]; 
					str = s.split("\\s"); //Segregating on the basis of sapce so extracting i.e. 424
					int x = Integer.parseInt(str[0]);
					
					if(x>500){
						System.out.println("title against points : "+x+" is : " +entry.getKey()); //Printing points having >500 and title against them			
				
					}
				}
				
				//move to next page
				WebElement next = driver.findElement(By.xpath("//i[@class='icon-fast-forward']"));
				
				next.click();
				driver.navigate().refresh();
	    }
	}
	
	
}
