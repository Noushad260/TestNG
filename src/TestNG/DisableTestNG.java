package TestNG;

import org.testng.annotations.Test;

public class DisableTestNG {

	@Test(enabled=false)
	public void md()
	{
		System.out.println("MD");
	}
	@Test
	public void noushad()
	{
		System.out.println("NOUSHAD");
	}
	
}
