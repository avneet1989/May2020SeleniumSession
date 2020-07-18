package May2020SeleniumSessions.May2020SeleniumSessions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JqueryBootStrapDropDown {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\14387\\OneDrive\\Documents\\TESTING from udemy\\all drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		WebElement firstList=driver.findElement(By.id("justAnInputBox"));
		firstList.click();
		Thread.sleep(4000);
		
		//1. to select only the single option.
		// use the css selector to access the comman in  all the option to reach the text of that element.
		
	/*	List<WebElement> firstOptionList=driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		
		
		//1. to select only the single option.
		// use the css selector to access the comman in  all the option to reach the text of that element
		
		for(int i=0;i<firstOptionList.size();i++) {
			String text=firstOptionList.get(i).getText();
			System.out.println(text);
			if(text.equals("choice 2 1")) {
				firstOptionList.get(i).click();
				break;
			}
			
		}
		*/
		
		// from the generic method
		//1. to select only the single option.
		// use the css selector to access the comman in  all the option to reach the text of that element
	/*	By firstOptionList= By.cssSelector("span.comboTreeItemTitle");
		selectChoiceValues(firstOptionList, "choice 2 1");
	*/	
	
		//2.multiple value select
		// to achive this we use String...value its called String 3dot operator.
		
	/*	By firstOptionList= By.cssSelector("span.comboTreeItemTitle");
		selectChoiceValues(firstOptionList, "choice 2 1","choice 6");
	*/
		
		
		//3.to select all values in the list.
		By firstOptionList= By.cssSelector("span.comboTreeItemTitle");
		selectChoiceValues(firstOptionList, "All");
		

	}
	//1.
/*	public static void selectChoiceValues(By locator, String value) {
		
		List<WebElement> firstOptionList=driver.findElements(locator);
		
		
		for(int i=0;i<firstOptionList.size();i++) {
			String text=firstOptionList.get(i).getText();
			System.out.println(text);
			if(text.equals(value)) {
				firstOptionList.get(i).click();
				break;
			}
			
		}
	*/	
	//2.
	/*	public static void selectChoiceValues(By locator, String...value) {
			
			List<WebElement> firstOptionList=driver.findElements(locator);
			
			
			for(int i=0;i<firstOptionList.size();i++) {
				String text=firstOptionList.get(i).getText();
				
				System.out.println(text);
				for(int k=0;k<value.length;k++) {
					if(text.equals(value[k])) {
						firstOptionList.get(i).click();
						
					}
					
				}
				
				
			}
		
	}
	*/
	public static void selectChoiceValues(By locator, String...value) {
		
		List<WebElement> firstOptionList=driver.findElements(locator);
		
		if (! value[0].equalsIgnoreCase("all")) {
			
		
		for(int i=0;i<firstOptionList.size();i++) {
			String text=firstOptionList.get(i).getText();
			System.out.println(text);
			for(int k=0;k<value.length;k++) {
				
			if(text.equals(value)) {
			
				firstOptionList.get(i).click();
				break;
			}
			}
		}
		
		}
	// select all the values if value[0]== to all
		// we make int all because value all working like array 
		else {
			try {
			for(int all=0;all<firstOptionList.size();all++) {
				firstOptionList.get(all).click();			
				}}
			catch(Exception e){
				//catch the Exception but donnt throw any exception on screen.
			}
			
			// we will get error becuz all other element are hidden or not intractable.
			// so we use the try catch to handle the exception.
			
		}
	
	}
	
}
