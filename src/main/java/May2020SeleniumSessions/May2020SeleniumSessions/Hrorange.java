package May2020SeleniumSessions.May2020SeleniumSessions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Hrorange {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\14387\\OneDrive\\Documents\\TESTING from udemy\\all drivers\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		 
		 
		 By searchUrl=By.id("Form_submitForm_subdomain");
		By firstName=By.id("Form_submitForm_FirstName"); 
		By lastName=By.id("Form_submitForm_LastName");
		By email=By.id("Form_submitForm_Email");
		By jobTitle=By.id("Form_submitForm_JobTitle");
		By CompanyName=By.id("Form_submitForm_CompanyName");
		By phoneNumber=By.id("Form_submitForm_Contact");
		By NoOfEmployees=By.id("Form_submitForm_NoOfEmployees");
		By industry= By.id("Form_submitForm_Industry");
		By country= By.xpath("//select[@id='Form_submitForm_Country']/option");
		
/*		Elementutilty em= new Elementutilty(driver);
		em.getelement(searchUrl).sendKeys("google");
		em.doSendKeys(firstName, "avnee");
		em.doSendKeys(lastName, "behni");
		em.doSendKeys(email, "email@12345");
		em.doSendKeys(jobTitle, "tester");
		em.doSendKeys(CompanyName, "google");
		em.doSendKeys(phoneNumber, "123456789");
		em.doSelectValueByVisibleText(NoOfEmployees, "16 - 20");
		em.doSelectValueByVisibleText(industry, "Automotive");
		em.selectValueFromDropDownList(country, "India");
*/		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	//Hrorange.getelement(searchUrl).sendKeys("google");
		Hrorange.doSendKeys(searchUrl, "google");
		Hrorange.doSendKeys(firstName, "avee");
		Hrorange.doSendKeys(lastName, "behni");
		Hrorange.doSendKeys(email, "email@12345");
		Hrorange.doSendKeys(jobTitle, "tester");
		Hrorange.doSendKeys(CompanyName, "google");
		Hrorange.doSendKeys(phoneNumber, "123456789");
		Hrorange.doSelectValueByVisibleText(NoOfEmployees, "16 - 20");
		Hrorange.doSelectValueByVisibleText(industry, "Automotive");
		Hrorange.selectValueFromDropDownList(country, "India");
		*/
		
		
		
	}
	
	
	/*public static WebElement getelement(By locator) {
		WebElement element=driver.findElement(locator);
		return element;
	}
	public static void doSendKeys(By locator, String value) {
		Hrorange.getelement(locator).sendKeys(value);
		
	}
	public static void doSelectValueByVisibleText(By locator, String value) {
		Select select= new Select(Hrorange.getelement(locator));
		select.selectByVisibleText(value);
		
	}
	public static void selectValueFromDropDownList(By locator,String value) {
		List<WebElement> countryList=driver.findElements(locator);
		for(int i=0;i<countryList.size();i++) {
			String text=countryList.get(i).getText();
			
			if(text.equals(value)) {
				countryList.get(i).click();
				break;
			}
			
		}
	}
	
	*/
	

}
