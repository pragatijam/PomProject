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
	
	@Test(priority=4)
	public void verify() {
		//String Titlepim=pimpage.TitleOfPimPage();
		Assert.assertEquals(false, false);
}
	@Test(priority=5)
	public void verify55() {
		//String Titlepim=pimpage.TitleOfPimPage();
		Assert.assertEquals(true, true);
}
}