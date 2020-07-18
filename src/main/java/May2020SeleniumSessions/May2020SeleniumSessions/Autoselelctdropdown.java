package May2020SeleniumSessions.May2020SeleniumSessions;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoselelctdropdown {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\14387\\OneDrive\\Documents\\TESTING from udemy\\all drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		By autoSelection= By.name("q");
		doSendKeys(autoSelection, "high");
		Thread.sleep(4000);
		
		
		// print all options from auto suggestions list
		
		//By autoSuggestion= By.xpath("//div[@class='sbl1.sbl1p']/span");
		//Autoselelctdropdown.autoListPrint(autoSuggestion);
		
		
		
		By autoDropDown=By.xpath("//ul[@class='erkvQe']/li//span");
		Autoselelctdropdown.doClickAutoSelecetion(autoDropDown, "high school musical");
		
		
		
		

	}
public static WebElement getElement(By locator) {
	WebElement element =driver.findElement(locator);
	return element;
}
public static void doSendKeys(By locator, String value) {
	getElement(locator).sendKeys(value);
	
}


public static void doClickAutoSelecetion(By locator, String value) {
	
	
	// using list and xpath to traves from parents to child class.
	List<WebElement> autoSelectionDrop=driver.findElements(locator);
	System.out.println(autoSelectionDrop.size());
	for(int i=0;i<autoSelectionDrop.size();i++) {
		String text=autoSelectionDrop.get(i).getText();
		System.out.println(text);
	/*	if(autoSelectionDrop.get(i).getText().equals(value))
		{
			autoSelectionDrop.get(i).click();
			break;
		}	*/
		}

}

public static void autoListPrint(By locator) {
	
	List<WebElement> listOfSelectOptions=driver.findElements(locator);
	for(int a=0;a<listOfSelectOptions.size();a++) {
		String all=listOfSelectOptions.get(a).getText();
		System.out.println(all);
	}
	
}


}
