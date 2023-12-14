package TestNG;

import org.testng.annotations.Test;


@Test(groups="User_Regression")
public class GroupinginTestNG {
	
		@Test(priority=1,groups="Regression")
		public void Apple()
		{
			System.out.println("Execute Apple");
		}
		@Test(priority=1,groups="SmokeTesting")
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



