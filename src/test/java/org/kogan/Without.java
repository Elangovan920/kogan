package org.kogan;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Without implements IRetryAnalyzer {
	
	int min=0;
	int max=4;
	public boolean retry(ITestResult arg0) {
		if(min<max) {
			min++;
			return true;
		}
		return false;
	}
	

}
