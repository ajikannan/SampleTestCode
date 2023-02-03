package org.junitfuns;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class OverAllTest {
	public static void main(String[] args) {
		Result run = JUnitCore.runClasses(TestRunnerClass.class);
		List<Failure> failures = run.getFailures();
		for(Failure failure:failures)
		{
			String string = failure.toString();
			System.out.println(string);

		}
		
		int failureCount = run.getFailureCount();
		System.out.println("failureCount"+failureCount);
		
		boolean wasSuccessful = run.wasSuccessful();
		System.out.println("Sucessfully Executed"+wasSuccessful);
		
	}
	

}
