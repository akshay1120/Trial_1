package pageObjectModel_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardTest 
{
	WebDriver driver;
	LoginPage lp = null ;
	DashboardPage dp = null ;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Offline%20Website/index.html");
		lp = new LoginPage(driver);
		dp = new DashboardPage(driver);
	}
	
	@Test   //For Tester Working on Dashboard page
	public void validLoginTest_2()
	{
		lp.ValidLogin();
		Assert.assertEquals(driver.getTitle(),lp.getTitle());
	}
	
	@Test
	public void coursesHeading()
	{
		lp.ValidLogin();
		dp.getCourses();
	}
}
