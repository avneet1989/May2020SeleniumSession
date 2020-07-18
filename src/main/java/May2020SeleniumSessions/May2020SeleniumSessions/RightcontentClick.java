package May2020SeleniumSessions.May2020SeleniumSessions;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightcontentClick {
	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\14387\\OneDrive\\Documents\\TESTING from udemy\\all drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		By rightClick=By.xpath("//span[text()='right click me']");
		By rightPrintAndSelect=By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]");
		doActionsRightClick(rightClick);
		Thread.sleep(3000);
		List<String> dropDownOption=doActionsRightPrintAndSelect(rightPrintAndSelect, "Copy" );
		System.out.println(dropDownOption);
		
		
		//doActionsRightPrintAndSelect(rightPrintAndSelect, "Copy" );
		
		driver.switchTo().alert();
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		
		driver.close();
		
		
	}
	
	public static WebElement getElement(By locator) {
		WebElement element=driver.findElement(locator);
		return element;
	}
	
	
	public static void doActionsRightClick(By locator) {
		
		
		WebElement mouseRightClick=getElement(locator);
		Actions ac=new Actions(driver);
		ac.contextClick(mouseRightClick).perform();
		
	
	}
	
	public static List<String> doActionsRightPrintAndSelect(By locator, String value) {
		List<String> allOptions=new ArrayList<String>();
				
		List<WebElement> mouseRightSelect=driver.findElements(locator);
		System.out.println(mouseRightSelect.size());
		for(int i=0;i<mouseRightSelect.size();i++) {
			String text=mouseRightSelect.get(i).getText();
			//System.out.println(text);
			allOptions.add(text);
			if(text.equals(value)) {
				mouseRightSelect.get(i).click();
				break;
			}
			
		}
		return allOptions;
		
	}
	
	
	
	
	
	
	
}
