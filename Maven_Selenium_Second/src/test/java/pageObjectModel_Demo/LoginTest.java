package pageObjectModel_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest 
{
	WebDriver driver;
	LoginPage lp = null ;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Offline%20Website/index.html");
		lp = new LoginPage(driver);
	}
	
	@Test   //For Tester working on Login Page
	public void validLoginTest_1()
	{
		lp.enterUname("kiran@gmail.com");
		lp.enterPass("123456");
		lp.clickLogin();
		Assert.assertEquals(driver.getTitle(),lp.getTitle());
	}
}
