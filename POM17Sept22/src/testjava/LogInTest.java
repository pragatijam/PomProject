package testjava;

import org.testng.Assert;
import org.testng.annotations.Test;

import mainjava.LoginPage;

public class LogInTest extends BaseTest {
	
	@Test(priority=0,groups={"smoke","regression"})
	public void VerifyTitleOfLoginPage() {
		String verifytitleofloginpagae=loginpage.TitleOfLoginPage();
		Assert.assertEquals(verifytitleofloginpagae, "Login");
		
	}
	
	@Test(priority=0,groups={"smoke","regression"})
	public void VerifyUrlOfPage() {
		String verifyurlofpage=loginpage.UrlOgPage();
		Assert.assertEquals(verifyurlofpage, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority=0,groups={"smoke","regression"})
	public void verifyLoginCorrectCredential() {
		loginpage.SetUserName("Admin");	
		loginpage.SetPassword("admin123");
		loginpage.ClickLogin();
	    String DashPage=dashboard.TitleOfDashboardPage();
		Assert.assertEquals(DashPage, "Dashboard");
	}

}
