package May2020SeleniumSessions.May2020SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowsers {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		String browser="Firefox";
		String url="https://www.facebook.com/";
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\14387\\OneDrive\\Documents\\TESTING from udemy\\all drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if (browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\14387\\OneDrive\\Documents\\TESTING from udemy\\all drivers\\geckodriver.exe");
			 driver= new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("InternetExplorer")){
			System.setProperty("webdriver.ie.driver","C:\\Users\\14387\\OneDrive\\Documents\\TESTING from udemy\\all drivers\\Command line server for the IE drive.exe");
			 driver= new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("Safari")){
			driver=new SafariDriver();
		}
		else {
			System.out.println("Please pass the correct browser "+browser);
		}
		
		
		
		driver.get(url);
		
		By userName=By.id("email");
		By password=By.id("pass");
		By login=By.id("loginbutton");
		
		
		CrossBrowsers.doSendKeys(userName, "aveet");
		doSendKeys(password, "123456");
		doClick(login);
		
		Thread.sleep(3000);
		driver.quit();

	}
	
	public static WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
		
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	

}
