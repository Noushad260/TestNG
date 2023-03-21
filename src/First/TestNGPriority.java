package First;

import org.testng.annotations.Test;
//(starting point) -3 -2 -1 0 1 2 3 (end point) 
//'''''''''''''''''''''''''''''''''''''''''''''
public class TestNGPriority {
	@Test (priority = -2)
	public void test1()
	{
		System.out.println("Testcase = 1");
	}
	@Test (priority = 1)
	public void test2()
	{
		System.out.println("Testcase = 2");
	}
	@Test (priority = 0)
	public void test3()
	{
		System.out.println("Testcase = 3");
	}
	@Test (priority = -1)
	public void test4()
	{
		System.out.println("Testcase = 4");
	}
	
	@Test (priority = 2)
	public void test5()
	{
		System.out.println("Testcase = 5");
	}

}
