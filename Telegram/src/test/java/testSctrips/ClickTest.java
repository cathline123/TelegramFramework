package testSctrips;

import org.testng.annotations.Test;

import ObjectRepository.WelcomePage;
import genericLibrary.BaseClass;

public class ClickTest extends BaseClass {
	
	@Test
	
	public void test_001() {
		
		WelcomePage welcomePage=new WelcomePage(driver);
		welcomePage.getBooksLink().click();
	}
	
    public void test_002() {
    	
    }
}
