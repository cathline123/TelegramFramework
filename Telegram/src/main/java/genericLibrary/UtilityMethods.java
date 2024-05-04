package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import javax.swing.text.Element;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods {
	public static void getwebPageScreenShot(WebDriver driver) {
		//step1
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//step 2
		File temp=ts.getScreenshotAs(OutputType.FILE);
		
		//step3
		File Permanent=new File("./Screenshots/"+getTime()+".png");
		
		
		//step4
		try {
			FileHandler.copy(temp, Permanent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public static void getWebElementScreenshot(WebElement element){
			
			//step 1
			File temp= element.getScreenshotAs(OutputType.FILE);
			
			//step 2
			File Permanent=new File("./Screenshots/"+getTime()+".png");
			
			
			//step 3
			try {
				FileHandler.copy(temp, Permanent);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		public static void switchToWindowByTitle(WebDriver driver,String title) {
		Set<String>  allWindows=driver.getWindowHandles();
		
		for(String window:allWindows) {
			driver.switchTo().window(window);
			String actualTitle=driver.getTitle();
			
			if(actualTitle.contains(title)) {
				break;
			
			
			}
		}
	}
		
		public static void switchToWindowByUrl(WebDriver driver,String title) {
			Set<String>  allWindows=driver.getWindowHandles();
			
			for(String window:allWindows) {
				driver.switchTo().window(window);
				String actualTitle=driver.getTitle();
				
				if(actualTitle.contains(title)) {
					break;
				
				
				}
			}
		}
		
		public static void switchToWindowByIndex(WebDriver driver,String title) {
			Set<String>  allWindows=driver.getWindowHandles();
			
			for(String window:allWindows) {
				driver.switchTo().window(window);
				String actualTitle=driver.getTitle();
				
				if(actualTitle.contains(title)) {
					break;
				
				
				}
			}
		}
		
		public static void selectOptionByIndex(WebElement dropdown,int index) {
			Select select=new Select(dropdown);
			select.selectByIndex(index);
		}
		
		public static void selectOptionByValue(WebElement dropdown,String value) {
			Select select=new Select(dropdown);
			select.selectByValue(value);
		}
		
		public static void selectOptionByText(WebElement dropdown,String visibleText) {
			Select select=new Select(dropdown);
			select.selectByVisibleText(visibleText);
		}
		
		
		private static String getTime() {
		// TODO Auto-generated method stub
		return LocalDateTime.now().toString().replace(":", "_").replace("-","_");
	}

}
