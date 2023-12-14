package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterclassAnnotation {
	@BeforeClass
	public void login()
	{
		System.out.println("Login Successfully");
	}
	@AfterClass
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

