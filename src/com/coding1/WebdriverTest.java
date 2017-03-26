package com.coding1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WebdriverTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL)
		      .click(driver.findElement(By.id("terms-link")))
		      .keyUp(Keys.CONTROL).perform();
	}
}
