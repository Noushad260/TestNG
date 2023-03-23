package First;

import org.testng.annotations.Test;

public class TestNGInvocation_count {
	
	@Test (invocationCount = 1)
	public void test1()
	{
		System.out.println("Testcase = 1");
	}
	
	@Test (invocationCount = 2)
	public void test2()
	{
		System.out.println("Testcase = 2");
	}
    
	@Test(invocationCount = 3)
	public void test3()
	{
		System.out.println("Testcase = 3");
	}
	
	@Test (invocationCount = 4)
	public void test4()
	{
		System.out.println("Testcase = 4");
	}
}
