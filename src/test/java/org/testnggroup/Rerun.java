package org.testnggroup;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Rerun {

	@Test(retryAnalyzer=IRetryCls.class)
	private void aj() {
        String s="Ajith";
        boolean contains = s.contains("R");
        System.out.println(contains);
        Assert.assertTrue(contains);
        
	}
}
