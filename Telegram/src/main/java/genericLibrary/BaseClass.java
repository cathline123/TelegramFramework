package genericLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;

import ObjectRepository.LoginPage;
import ObjectRepository.WelcomePage;

public class BaseClass {
	public WebDriver driver;
  @BeforeSuite
  public void bs() {
	  report=new ExtentReports("./Reports/")
	  System.out.println("Before Suite");
  }
  
  @BeforeTest
  public void bt() {
	  System.out.println("Before Test");
  }
 
  @BeforeClass
  public void LaaunchBrowser() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demowebshop.tricentis.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  System.out.println("Before Class");
  }
  
  
  @BeforeMethod
  public void login() {
	  WelcomePage welcomePage=new WelcomePage(driver);
	  welcomePage.getLoginLink().click();
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.getLoginEmailTextField().click();
	  loginPage.getLoginPasswordTextField().click();
	  loginPage.getLoginLoginButton().click();
   System.out.println("Before Method");
}
  
  @AfterSuite
  public void as() {
	  System.out.println("After Suite");
  }
  
  @AfterTest
  public void at() {
	  System.out.println("After Test");
  }
  
  @AfterMethod 
  public void logOut(){
	  WelcomePage welcomePage=new WelcomePage(driver);
	  welcomePage.getLogOutLink().click();
	  System.err.println("After Method");
  }
  
  @AfterClass
  public void closeBrowser() {
	  driver.quit();
	  System.out.println("After Class");
  }
  
 
}



