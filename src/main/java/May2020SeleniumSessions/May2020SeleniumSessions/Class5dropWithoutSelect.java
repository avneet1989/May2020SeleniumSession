package May2020SeleniumSessions.May2020SeleniumSessions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class5dropWithoutSelect {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\14387\\OneDrive\\Documents\\TESTING from udemy\\all drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		//without Select class we use for loop and always use the xpath to traverse from parents to childs
		
		
		By dayOptions=By.xpath("//Select[@id='day']/option");
		
		Class5dropWithoutSelect.selectValuesFromDropDownList(dayOptions, "18");
	
			
		}

	
	
	
	public static List<WebElement> selectValuesFromDropDownList(By locator, String value) {
		List<WebElement> dayList=driver.findElements(locator);
		
		//System.out.println(dayList.size());
		
		for (int i=0;i<dayList.size();i++) {
			//System.out.println(dayList.get(i).getText());
			String text=dayList.get(i).getText();
			if(text.equals(value)) {
				dayList.get(i).click();
				break;
			}
			
			
		}
		return dayList;
	}

}
