package May2020SeleniumSessions.May2020SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {
	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\14387\\OneDrive\\Documents\\TESTING from udemy\\all drivers\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			String expectedUrl="https://www.facebook.com/";
			String url="https://www.facebook.com/";
			
			
			driver.get(url);
			
			
			
			String actualUrl=driver.getCurrentUrl();
			System.out.println(actualUrl);
			if(actualUrl.equals(expectedUrl)) {
				System.out.println("Url is correct");
			}
			else{
				System.out.println("Url is not same");
			}
			
			
			
			String pageTitle=driver.getTitle();
			System.out.println(pageTitle);
			
			//System.out.println(driver.getPageSource());
			Thread.sleep(3000);
			driver.quit();		
			
		}

}
