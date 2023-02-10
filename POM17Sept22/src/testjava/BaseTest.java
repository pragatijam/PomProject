package testjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.BaseClass;
import mainjava.DashboardPage;
import mainjava.LoginPage;
import mainjava.PimPage;

public class BaseTest extends BaseClass{
	
	@BeforeSuite
	public void InitBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	
	@BeforeClass
	public void PageObjects() {
		 loginpage = new LoginPage(driver);
		dashboard = new DashboardPage(driver);
		pimpage = new PimPage(driver);
	}
	
	@AfterClass
	public void tearDownEnvironment() {
		driver.quit();
	}
	

}
