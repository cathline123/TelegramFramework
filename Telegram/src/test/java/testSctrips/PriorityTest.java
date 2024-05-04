package testSctrips;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority = 0)
	public void register() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Register");
		driver.quit();
		}
	
	@Test(priority = 1)
	public void login() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Login");
		driver.quit();
		}
	
	@Test(priority = 2)
	public void addToCart() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Add To Cart");
		driver.quit();
		}
	
	@Test(priority = 3)
	public void payment() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Payment");
		driver.quit();
		}
	
	@Test(priority = 4)
	public void confirmOrder() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Confirm Order");
		driver.quit();
		}

}
