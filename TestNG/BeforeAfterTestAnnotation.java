package TestNG;

import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTestAnnotation {
	@BeforeTest
	public void login()
	{
		System.out.println("Login Successfully");
	}
	@AfterTest
	public void logout()
	{
		System.out.println("Logout Successfully");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Beforeclass Login Successfully");
	}
	@AfterClass
	public void Afterclass()
	{
		System.out.println("Afterclass Logout Successfully");
	}
	
	
}



