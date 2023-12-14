package TestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestcase {
	
	boolean datasetup=true;
	@Test(enabled=false)
	public void skiptest1()
	{
		System.out.println("Skip this testcase after completed");
	}
	@Test
	public void skiptest2()
	{
		System.out.println("Skip this testcase forcefully");
		throw new SkipException("This tesrcase will skip");
	}
	@Test
	public void skiptest3()
	{
		System.out.println("Skip this testcase3");
		if(datasetup==true)
		{
			System.out.println("Execute the testcase");
			
		}
		else
			System.out.println("Do not execute this test case");
		throw new SkipException("This tesrcase will skip");
	}


}
