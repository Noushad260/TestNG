package TestNG;

import org.testng.annotations.Test;

public class PriorityTestNg {

	@Test(priority=1)
	public void test1()
	{
		System.out.println("test case = 1");
	}
	
	@Test(priority=-1)
	public void test2()
	{
		System.out.println("test case = 2");
	}
	
	@Test(priority=0)
	public void test3()
	{
		System.out.println("test case = 3");
	}
	
	@Test(priority=-2)
	public void test4()
	{
		System.out.println("test case = 4");
	}
}
