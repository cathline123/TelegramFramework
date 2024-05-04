package testSctrips;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountAndThreadPoolSize {
	@Test(invocationCount = 5,threadPoolSize = 2)//5 times execute in pair of 2,2,1
	public void register() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Register");
		driver.quit();
		}
	
	@Test(invocationCount = 5,threadPoolSize = 6)//5 times execute in pair of 2,2,1 another one will be hidden
	public void login() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Login");
		driver.quit();
		}
	
	@Test(invocationCount = 0,threadPoolSize = 1)//error
	public void addToCart() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Add To Cart");
		driver.quit();
		}
	
	@Test(invocationCount = 0,threadPoolSize = 2)//1 time execute and its bug
	public void payment() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Payment");
		driver.quit();
		}
	
	@Test(invocationCount = 5,threadPoolSize = 0)//5 time ececute one by one ,not in parallel method 5t
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void confirmOrder() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Confirm Order");
		driver.quit();
		}

}


