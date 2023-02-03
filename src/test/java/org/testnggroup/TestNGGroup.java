package org.testnggroup;

import static org.junit.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGGroup {
	
	@Test(groups="A",dependsOnGroups="B")
	private void test1() {
      System.out.println("Test Case 1");
	}
	@Test(groups="A")
	private void test2() {
      System.out.println("Test Case 2");
	}
	@Test(groups="B")
	private void test3() {
		String s="Aji";
		boolean contains = s.contains("K");
		Assert.assertTrue(contains);
      System.out.println("Test Case 3");
	}
	@Test(groups="C")
	private void test4() {
      System.out.println("Test Case 4");
	}
	@Test(groups="A")
	private void test5() {
      System.out.println("Test Case 5");
	}
	@Test(groups="B")
	private void test6() {
      System.out.println("Test Case 6");
	}
	@Test(groups="C")
	private void test7() {
      System.out.println("Test Case 7");
	}
	@Test(groups="A")
	private void test8() {
      System.out.println("Test Case 8");
	}
	@Test(groups="B")
	private void test9() {
      System.out.println("Test Case 9");
	}
	@Test(groups="C")
	private void test10() {
      System.out.println("Test Case 10");
	}
  	@Test(groups="C")
  	private void test() {
        System.out.println("Test Case 10");
	}
}
