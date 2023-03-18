package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenGoogle {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	}
	@Test
	public void openActiTime()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Login_page lp=new Login_page(driver);
		lp.setLogin("admin", "manager");
		
	}
	

}
