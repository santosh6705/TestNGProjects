package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassName3 {
	 @Test
	public void login()
	{
		System.out.println("Login successfully");
	}
	 @Test
	 public void logout()
	 {
		 System.out.println("Logout successfully");
		 
	 }
	 @Test(dependsOnMethods= {"advancesearch"})
	 public void search()
	 {
		 System.out.println("Seach successfully");
	 }
	 @Test
	 public void advancesearch()
	 {
		 Assert.assertEquals("Gmail4","Gmail"); 
	 }

}
