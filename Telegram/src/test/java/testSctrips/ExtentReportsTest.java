package testSctrips;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import ObjectRepository.ApparelsPage;
import ObjectRepository.WelcomePage;
import genericLibrary.BaseClass;

public class ExtentReportsTest extends BaseClass {
	@Test
	
	public void apparels_001() {
		WelcomePage welcomePage=new WelcomePage(driver);
		welcomePage.getApparelslink().click();
		ApparelsPage apparelsPage=new ApparelsPage(driver);
		test.log(LogStatus.INFO,"Clicked on Apparels Link");
        //verify Apparel page is displayed
		Assert.assertEquals(apparelsPage.getApparelsPageTitle().getText(), "");
	    test.log(LogStatus.PASS,"Apparels page is displayed");
	    
	    //to print in testNG report and in console 
	   // Reporter.log("Print Output", true);
		
	}

}
