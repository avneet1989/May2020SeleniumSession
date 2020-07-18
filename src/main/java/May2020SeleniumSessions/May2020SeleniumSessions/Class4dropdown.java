package May2020SeleniumSessions.May2020SeleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Class4dropdown {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\14387\\OneDrive\\Documents\\TESTING from udemy\\all drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
	/*	WebElement day=driver.findElement(By.id("day"));
		Select dy= new Select(day);
		dy.selectByVisibleText("10");// good to use static in nature by index may b change in future.
		dy.selectByValue("17");
		
		
		WebElement month= driver.findElement(By.id("month"));
		Select moth= new Select(month);
		moth.selectByValue("2");
		*/
		
		By dy= By.id("day");
		By moth= By.id("month");
		
		Class4dropdown.doSelectValueByVisibleText(dy, "10");
		Class4dropdown.doSelectValueByVisibleText(moth, "Feb");
		
		
	}
	
	public static void doSelectValueByVisibleText(By locator, String value) {
		
		Select select= new Select(getElement(locator));
		select.selectByVisibleText(value);
		
	}
	
	public static WebElement getElement(By locator) {
		WebElement element=driver.findElement(locator);
		return element;
	}

}
