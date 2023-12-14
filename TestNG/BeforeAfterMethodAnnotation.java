package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterMethodAnnotation {
	@BeforeMethod
	public void login()
	{
		System.out.println("Login Successfully");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("Logout Successfully");
	}
	@Test(priority=2)
	public void AddProduct()
	{
		System.out.println("Add two product");
	}
	@Test(priority=1)
	public void  Product()
	{
		System.out.println("Only two product");
	}

}
