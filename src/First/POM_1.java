package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_1 {
	
	@FindBy (id="email")
	private WebElement id;
	
	@FindBy (id="pass")
	private WebElement pwd;
	
	@FindBy (name="login")
	private WebElement login;
	
	public POM_1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setid(String id) {
		this.id.sendKeys(id);
	}
	
	public void setpwd(String pwd)
	{
		this.pwd.sendKeys(pwd);
	}
	
	public void setlogin()
	{
		this.login.click();
	}
	
	

}
