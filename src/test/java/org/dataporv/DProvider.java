package org.dataporv;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DProvider {
	
	@DataProvider(name="Datas")

     private Object[][] getDatas()
     {
		return new Object[][]
				{
			{"ajithkannan1712@gmail.com","517Ajith@alagu"},
			{"nmkajith055@gmail.com","517Ajith@alagu"},
			{"ajith@gmail.com","517Ajith@alagu"},
			{"nmkaj89rr@gmail.com","517Ajith@alagu"},
			{"ravirajan34@gmail.com","517Ajith@alagu"}
				};
     }

@Test(dataProvider="Datas")
private void DP(String username, String Password)
{
System.out.println(username);
System.out.println(Password);
	
}
}