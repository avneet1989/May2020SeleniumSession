package May2020SeleniumSessions.May2020SeleniumSessions;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdownlist {
	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\14387\\OneDrive\\Documents\\TESTING from udemy\\all drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
	// using select class and we use id not xpath.
		By industry= By.id("Form_submitForm_Industry");
		By country=By.id("Form_submitForm_Country");
		
		
		
		ArrayList<String> industryList=new ArrayList<String>(Dropdownlist.getDropdownListValueOptions(industry));
		System.out.println(industryList);
		//List<String> counrtyList=Dropdownlist.getDropdownListValueOptions(country);
		//System.out.println(counrtyList);
	}
public static ArrayList<String> getDropdownListValueOptions(By locator)
{
	
	ArrayList<String> optionList=new ArrayList<String>();
	
	Select select= new Select(getElement(locator));
	List<WebElement> dropDownList=select.getOptions();
	System.out.println(dropDownList.size());
	
	for(int i=0;i<dropDownList.size();i++) {
		String list=(dropDownList.get(i).getText());
		System.out.println(i+" "+ list);
	}
	return optionList;
	
}
	
	public static WebElement getElement(By locator) {
	WebElement element =	driver.findElement(locator);
	return element;
	
	
	}
	
}
