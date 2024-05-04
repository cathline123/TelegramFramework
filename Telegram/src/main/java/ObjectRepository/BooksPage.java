package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {

	public BooksPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
		
		@FindBy(xpath = "//div[@class='page-title']/h1")
		private WebElement booksPageTitle;

		public WebElement getBooksPageTitle() {
			return booksPageTitle;
		}
		
	

}
