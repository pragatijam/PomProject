package mainjava;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import testjava.BaseTest;

public class LocalClass extends BaseTest {
	
	@BeforeClass
	public void verifyLoginCorrectCredential() {
		loginpage.SetUserName("Admin");	
		loginpage.SetPassword("admin123");
		loginpage.ClickLogin();
	    String DashPage=dashboard.TitleOfDashboardPage();
		Assert.assertEquals(DashPage, "Dashboard");
	}

}
