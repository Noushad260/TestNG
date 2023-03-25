package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class POM_2 {
	WebDriver driver;
	@Test
	public void Facebook()
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver=new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		POM_1 p=new POM_1(driver);
		p.setid("alinoushad260@gmail.com");
		p.setpwd("razamd260@G");
		p.setlogin();
	}

}
