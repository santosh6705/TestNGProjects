package TestNG;

import org.testng.annotations.Test;

public class ClassName2 {
	@Test(priority=2)
	public void verifyTiltle()
	{
		System.out.println("Verify Title Methods");
	}
	@Test(priority=1)
	public void abcd()
	{
		System.out.println("abcd Methods");
	}
	@Test(priority=3)
	public void abc()
	{
		System.out.println("abc Methods");
	}

}
