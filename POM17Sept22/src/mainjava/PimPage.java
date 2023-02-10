package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testjava.BaseTest;

public class PimPage extends BaseTest {
	
	
	//all the locators on the page
	@FindBy(xpath="//span[text()='PIM']")
	WebElement pimpage;
	

	
	//initialization of locators
	public PimPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
		
		//methods
		
		public String TitleOfPimPage() {
		return pimpage.getText();
	}
		
	
}
