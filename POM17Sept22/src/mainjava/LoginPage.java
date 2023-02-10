package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testjava.BaseTest;

public class LoginPage extends BaseTest {
	
	//all the locator on this page
	@FindBy(xpath="//*[text()='Login']")
	WebElement txtloginpage;
	
	@FindBy(name="username")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement Pass;
	
	@FindBy(tagName="button")
	WebElement btnlogin;
	
	
	
	//initialization of locators
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	//methods for testcase
	
	/* Author:Pragati Jamdade
	 * Date: 04 Feb 2023
	 * Description:this test case used to get page title
	 * Parameter:String
	 */
	
	public String TitleOfLoginPage() {
		return txtloginpage.getText();
	}
	
	/* Author:Pragati Jamdade
	 * Date: 04 Feb 2023
	 * Description:this test case used to verify current url of page
	 * Parameter:String
	 */
	
	public String UrlOgPage(){
		 return driver.getCurrentUrl();
	}

	/* Author:Pragati Jamdade
	 * Date: 04 Feb 2023
	 * Description:this test case used to set username
	 * Parameter:
	 */
	public void SetUserName(String usrname) {
		UserName.sendKeys(usrname);
	}
	
	/* Author:Pragati Jamdade
	 * Date: 04 Feb 2023
	 * Description:this test case used to set password
	 * Parameter:String
	 */
	public void SetPassword(String Password) {
		Pass.sendKeys(Password);
		
	}
	
	
	/* Author:Pragati Jamdade
	 * Date: 04 Feb 2023
	 * Description:this test case used to click on login
	 * Parameter:String
	 */
	public void ClickLogin() {
		btnlogin.click();
	}
}
