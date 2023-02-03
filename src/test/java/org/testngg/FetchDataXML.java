package org.testngg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FetchDataXML {
	@Parameters({"user","pass"})
	@Test
	private void aj(String username, String password)
	{
      System.out.println("Username"+username);	
      System.out.println("Password"+password);	
      
	}

}
