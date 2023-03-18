package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	@FindBy(id="username")
	private WebElement unTbx;
	
	@FindBy(name="pwd")
	private WebElement pwTbx;
	
	@FindBy(id="loginButton")
	private WebElement login;
	
	public Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void  setLogin(String un,String pwd)
	{
		unTbx.sendKeys(un);
		pwTbx.sendKeys(pwd);
		login.click();
		
	}
}
