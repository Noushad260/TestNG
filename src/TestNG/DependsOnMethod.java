package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DependsOnMethod {
	WebDriver driver;

	@Test
	public void navigate() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		driver.get("https://www.facebook.com/");

	}

	@Test(dependsOnMethods = {"navigate"})
	public void login() {
		SoftAssert soft = new SoftAssert();
		driver.findElement(By.id("email")).sendKeys("alinoushad260@gmail.com", Keys.TAB + "razamd260@G", Keys.ENTER);
		WebElement Home = driver.findElement(By.xpath("//span[text()='Live video']"));
		System.out.println(Home.getText());
		soft.assertEquals(Home, "Live video");
	}

	@Test (dependsOnMethods={"login"})
	public void chat() throws InterruptedException
	{
		SoftAssert soft = new SoftAssert();
		driver.findElement(By.xpath("//div[@aria-label=\"Messenger\"][1]")).click();
		Thread.sleep(3000);
		WebElement chat=driver.findElement(By.xpath("//div[@aria-label=\"Chats\"]/div/div/div/div/header"));
		System.out.println(chat.getText());
		soft.assertEquals(chat, "Chats");
		
	}
}

