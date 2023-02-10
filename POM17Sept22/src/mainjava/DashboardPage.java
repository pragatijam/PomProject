package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testjava.BaseTest;

public class DashboardPage extends BaseTest{
	
	//all the locator on this page
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement dashboard;		
	
	
	//initialization of locators
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//methods for testcase
	
	/* Author:Pragati Jamdade
	 * Date: 04 Feb 2023
	 * Description:this test case used to verify dashboard page title
	 * Parameter:String
	 */
   public String TitleOfDashboardPage() {
	  return dashboard.getText();
   }
}
