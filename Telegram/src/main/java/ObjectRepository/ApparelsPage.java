package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApparelsPage {

	public ApparelsPage(WebDriver driver) {
    PageFactory.initElements(driver,this);		
	}
	
	@FindBy(xpath = "//div[@class='page-title']//h1")
	private WebElement apparelsPageTitle;

	public WebElement getApparelsPageTitle() {
		return apparelsPageTitle;
	}

}
