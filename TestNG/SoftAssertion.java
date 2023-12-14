package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertion {
	public void Softassert()
	{
	String Actual_title="Google";
	String Expected_title="Google1";
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	System.out.println(driver.getTitle());
	System.out.println("Execution started");
	SoftAssert softAssert = new SoftAssert();
	softAssert.assertEquals(Actual_title, Expected_title);
	System.out.println("Testcase pass");

}
}