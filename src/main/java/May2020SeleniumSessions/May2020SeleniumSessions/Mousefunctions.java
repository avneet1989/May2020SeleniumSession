package May2020SeleniumSessions.May2020SeleniumSessions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Mousefunctions {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\14387\\OneDrive\\Documents\\TESTING from udemy\\all drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.get("https://book.spicejet.com/");
		
	/*	WebElement rightMove=driver.findElement(By.id("Login"));
		WebElement rightMove2=driver.findElement(By.xpath("//ul[@id='menu-list-login']/li[1]/a"));
		WebElement rightMove3=driver.findElement(By.xpath("//ul[@id='menu-list-login']/li/ul/li[1]/a"));
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(rightMove).perform();
		Thread.sleep(3000);
		
		ac.moveToElement(rightMove2).perform();
		Thread.sleep(3000);
		ac.moveToElement(rightMove3).click().perform();
		*/
		
		By rightMove=By.id("Login");
		By allOptions=By.xpath("//ul[@id='menu-list-login']/li");
		By rightMove2=By.xpath("//ul[@id='menu-list-login']/li[1]/a");
		By rightMove3=By.xpath("//ul[@id='menu-list-login']/li/ul/li[1]/a");
		By mobileNumber=By.id("ControlGroupLoginView_MemberLoginView2LoginView_TextBoxUserID");

		
		
		
		
		doActionsMove(rightMove);
		Thread.sleep(3000);
		doActionsOptionPrint(allOptions, "Travel Agent Login");
		doActionsMove(rightMove2);
		Thread.sleep(3000);
		doActionsMove(rightMove3);
		doActionsClick(rightMove3);
		Thread.sleep(3000);
		doActionsClick(mobileNumber);
		doActionsSendKeys(mobileNumber, "123456");
		
		
	}
	
	public static WebElement getElement(By locator) {
		WebElement element=driver.findElement(locator);
		return element;
	}
	public static void doActionsMove(By locator) {
		Actions ac=new Actions(driver);
		ac.moveToElement(getElement(locator)).perform();
		
	}
	
	public static void doActionsClick(By locator) {
		Actions ac=new Actions(driver);
		ac.click(getElement(locator)).perform();
		
	}
	
	public static void doActionsOptionPrint(By locator,String value) {
		Actions ac=new Actions(driver);
		List<WebElement> mouseList=driver.findElements(locator);
		System.out.println(mouseList.size());
		
		for(int i=0;i<mouseList.size();i++)
		{
			String text=mouseList.get(i).getText();
				System.out.println(text);
				if(text.equals(value)) {
					mouseList.get(i).click();
					break;
				}
			}
	
	}
	
	
	public static void doActionsSendKeys(By locator, String value) {
		Actions ac=new Actions(driver);
		ac.sendKeys(getElement(locator), value).perform();
		
	}

}
