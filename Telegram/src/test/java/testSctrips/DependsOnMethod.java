package testSctrips;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
		@Test(groups = "smoke")
		public void register() {
			WebDriver driver=new ChromeDriver();
			System.out.println("Register");
			driver.get("hghfh");
			driver.quit();
			}
		
		@Test(dependsOnMethods = "register")
		public void login() {
			WebDriver driver=new ChromeDriver();
			System.out.println("Login");
			driver.quit();
			}
		
		@Test(dependsOnMethods = "login")
		public void addToCart() {
			WebDriver driver=new ChromeDriver();
			System.out.println("Add To Cart");
			driver.quit();
			}
		
		@Test(dependsOnMethods = "addToCart")
		public void payment() {
			WebDriver driver=new ChromeDriver();
			System.out.println("Payment");
			driver.quit();
			}
		
		@Test(dependsOnMethods = "payment")
		public void confirmOrder() {
			WebDriver driver=new ChromeDriver();
			System.out.println("Confirm Order");
			driver.quit();
			}

	}


