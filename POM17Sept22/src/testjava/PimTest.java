package testjava;

import org.testng.Assert;
import org.testng.annotations.Test;

import mainjava.LocalClass;

public class PimTest extends LocalClass {
	
	@Test(priority=4)
	public void VerifyPimPages() {
		String Titlepim=pimpage.TitleOfPimPage();
		Assert.assertEquals(Titlepim, "PIM");
		
		
	}
}
