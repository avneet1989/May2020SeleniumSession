package May2020SeleniumSessions.May2020SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {
	public WebDriver driver;
	
	public WebDriver LaunchBrowsers(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) 
		{
	
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	
	}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		
		
		else if(browser.equalsIgnoreCase("safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver= new SafariDriver();
		}
		else {
			System.out.println("Please pass the correct browser"+ browser);
		}
		return driver;
	}
	
	
	
	
	
	
	public void launchUrl(String url) {
		driver.get(url);
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	public String getPageCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	
	public  WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
		
	}
	
	public  void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public  void doClick(By locator) {
		getElement(locator).click();
	}
	
	public void doclose() {
		driver.close();
	}
	
public void withoutSelectclassPrint(By locator) {
	
	List<WebElement> listOfDropDown=driver.findElements(locator);
	for(int i=0;i<listOfDropDown.size();i++) {
		String text=listOfDropDown.get(i).getText();
		System.out.println(text);
	}

}

public void selectValueWithoutSelectDrop( By locator,String value) {
	
	List<WebElement> listOfDropDown=driver.findElements(locator);
	for(int i=0;i<listOfDropDown.size();i++) {
		String text=listOfDropDown.get(i).getText();
		System.out.println(text);
		if(text.equalsIgnoreCase(value)) {
			listOfDropDown.get(i).click();
			break;
		}
	}

}


}
