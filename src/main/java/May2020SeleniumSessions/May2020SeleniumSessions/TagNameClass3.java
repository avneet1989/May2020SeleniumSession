package May2020SeleniumSessions.May2020SeleniumSessions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagNameClass3 {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\14387\\OneDrive\\Documents\\TESTING from udemy\\all drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		/*
		driver.get("https://www.amazon.ca/");
		//always put elements in a webelement and create a array list.
		// to count the number of things with text
		List<WebElement> tagName= driver.findElements(By.tagName("a"));
		System.out.println(tagName.size());
		for(int a=0;a<tagName.size();a++) {
			String text=tagName.get(a).getText();
			if(!(text.isEmpty())) {
				
				System.out.println(text);
		}
		}*/
	
	//driver.get("https://www.google.co.in/webhp");
	/*	List<WebElement> footLinks=driver.findElements(By.xpath("//span[@id='fsl']/a"));
	System.out.println(footLinks.size());
	// for click on the specific link
	for(int b=0;b<footLinks.size();b++) {
		String text= footLinks.get(b).getText();
		if (text.equals("Business")) {
			footLinks.get(b).click();
			break;
		}
		
		
	}*/
	
	// call by method
//		driver.get("https://www.facebook.com/");
//	TagNameClass3.footerLinks(driver, "Fran�ais (Canada)");
	
	//to click the all the links one by one 
	driver.get("https://www.facebook.com/");
	List<WebElement> footLinks=driver.findElements(By.xpath("//div[@id='pageFooter']/ul/li/a"));
	System.out.println(footLinks.size());
	for(int b=0;b<footLinks.size();b++) {
		footLinks.get(b).click();			/// it will work on first link but not on another becuz it lose it version id and after click first link it make another version id
		footLinks=driver.findElements(By.xpath("//div[@id='pageFooter']/ul/li/a"));		// to overcome this problem we again use driver.findelement	
	}
	
	

	
	
	}
//	public static void footerLinks(WebDriver driver, String language) {
//		
//		List<WebElement> footLinks=driver.findElements(By.xpath("//div[@id='pageFooter']/ul/li/a"));
//		//System.out.println(footLinks.size());
//		// for click on the specific link
//		for(int b=0;b<footLinks.size();b++) {
//			String text= footLinks.get(b).getText();
//			if (text.equals(language)) {
//				footLinks.get(b).click();
//				break;
//			}
//			
//			
//		}
//	}

}
