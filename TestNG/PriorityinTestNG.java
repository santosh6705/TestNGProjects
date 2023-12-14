package TestNG;
import org.testng.annotations.Test;

public class PriorityinTestNG {
	@Test(description="Regression")
	public void Apple()
	{
		System.out.println("Execute Apple");
	}
	@Test(description="SmokeTesting")
	public void Cat()
	{
		System.out.println("Execute cat");
	}
	@Test(description="progression")
	public void Dog()
	{
		System.out.println("Execute Dog");
	}
	@Test(description="Production")
	public void Banana()
	{
		System.out.println("Execute Banana");
	}
	
}
