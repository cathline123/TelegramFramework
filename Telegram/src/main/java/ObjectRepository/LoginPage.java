package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	
	public LoginPage(WebDriver driver) {
     PageFactory.initElements(driver,this);		
	}

	@FindBy(id = "Email")
	private WebElement loginEmailTextField;
	
	@FindBy(id = "Password")
	private WebElement loginPasswordTextField;
	
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	private WebElement loginLoginButton;

	public WebElement getLoginEmailTextField() {
		return loginEmailTextField;
	}

	public WebElement getLoginPasswordTextField() {
		return loginPasswordTextField;
	}

	public WebElement getLoginLoginButton() {
		return loginLoginButton;
	}

}
