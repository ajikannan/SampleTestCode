package org.testngg;

import org.testng.annotations.Test;

public class TestCases {
	
	@Test(priority=1)
	private void aji() {
		System.out.println("Test NG");
	}

	@Test(priority=-8)
	private void test1()
	{
		System.out.println("Test1");
	}
	@Test(priority=3,invocationCount=10)
	private void test2()
	{
		System.out.println("Test2");
	}
	@Test(priority=5)
	private void test3()
	{
		System.out.println("Test3");
	}
}
