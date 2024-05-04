package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
		@FindBy(linkText = "Books") 
		private WebElement booksLink;
		
		@FindBy(linkText = "Log in")
		private WebElement loginLink;
		
		@FindBy(linkText = "Log out")
		private WebElement logOutLink;
		
		@FindBy(linkText = "Apparel & Shoes")
		private WebElement apparelslink;
		
		public WebElement getApparelslink() {
			return apparelslink;
		}

		public WebElement getLogOutLink() {
			return logOutLink;
		}

		public WebElement getLoginLink() {
			return loginLink;
		}

		public WebElement getBooksLink() {
			return booksLink;
		}
		
		
	
	}

