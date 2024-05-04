package testSctrips;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.BooksPage;
import ObjectRepository.WelcomePage;

public class BooksTest {
@Test(groups = "smoke")
public void books_001() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WelcomePage welcomePage=new WelcomePage(driver);
	BooksPage booksPage=new BooksPage(driver);
	
	//click on books link
	welcomePage.getBooksLink().click();
	
	//verify books page is displayed
	if(booksPage.getBooksPageTitle().getText().equals("Books")) {
		System.out.println("Pass");
	}
		else {
			System.out.println("Fail");
		}			
		}
}	
	
	
	
	
	
	
	




