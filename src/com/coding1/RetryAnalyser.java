package com.coding1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer{

	int count=0;
	@Override
	public boolean retry(ITestResult result) {		
			if(count<4){
				count++;
				return true;			
			}			
				return false;
	}
	
}
