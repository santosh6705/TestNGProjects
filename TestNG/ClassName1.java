package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassName1 {
	@Test
	public void verifyTitle()
	{
		Assert.assertEquals("Yahoo", "Yahoo0");
	}
	@Test
	public void abcd()
	{
		Assert.assertEquals("Gmail", "Gmail");
		
		}
	@Test
	public void abc()
	{
		Assert.assertEquals("Gmail0", "Gmail");
		
		}
  
}

