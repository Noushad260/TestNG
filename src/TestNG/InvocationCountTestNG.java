package TestNG;

import org.testng.annotations.Test;

public class InvocationCountTestNG {

	@Test(invocationCount=2)
	public void test1()
	{
		System.out.println("MD");
	}
	
	@Test (invocationCount=3)
	public void test2()
	{
		System.out.println("Ansari");
	}
}
