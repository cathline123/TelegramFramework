package testSctrips;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnableTest {
	@Test(invocationCount = 5,threadPoolSize = 2,enabled = true)//5 times execute in pair of 2,2,1
	public void register() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Register");
		driver.quit();
		}
	//Enabled= true is default value ,enabled= false means the script will not execute
	@Test(invocationCount = 5,threadPoolSize = 6,enabled = false)//5 times execute in pair of 2,2,1 another one will be hidden
	public void login() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Login");
		driver.quit();
		}
}
