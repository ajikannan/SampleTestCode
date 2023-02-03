package org.testnggroup;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryCls implements IRetryAnalyzer{
	int minium=0;
	int max=12;
	public boolean retry(ITestResult arg0) {
            
		if(minium<=max)
		{
			minium++;
         return true;
		}
		return false;
	}
	}
