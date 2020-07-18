package May2020SeleniumSessions.May2020SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frames {

	public static void main(String[] args) {
	String browser="chrome";
		//String url="http://www.londonfreelance.org/courses/frames/index.html";
		String url="https://classic.freecrm.com/index.html";
		WebDriverFactory wf=new WebDriverFactory();
		WebDriver driver=wf.LaunchBrowsers(browser);
		wf.launchUrl(url);
		ElementUtility elementUlDriver= new ElementUtility(driver);
		
		//2. method to call frame
		//swithto().frame(name);
		/*
		driver.switchTo().frame("main");
		By frameText=By.xpath("//h2[contains(text(),'Title bar')]");
		System.out.println(elementUlDriver.getPageText(frameText));
		*/
		
		
		
		//or 3. method to call frameis by making frame element
	/*	driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='main']")));
		By frameText=By.xpath("//h2[contains(text(),'Title bar')]");
		System.out.println(elementUlDriver.getPageText(frameText));
		
		
		
		driver.switchTo().defaultContent();
		elementUlDriver.doclose();
		*/
		
		By userName=By.xpath("//input[@placeholder='Username']");
		By password=By.xpath("//input[@placeholder='Password']");
		By login=By.xpath("//input[@class='btn btn-small']");
		elementUlDriver.doSendKeys(userName, "batchautomation");
		elementUlDriver.doSendKeys(password, "test@12345");
		elementUlDriver.doClick(login);
		
		driver.switchTo().frame(driver.findElement(By.name("mainpanel")));
		By contact=By.xpath("//a[contains(text(),'Contacts')]");
		elementUlDriver.doClick(contact);
		
		
		
		
		By logout=By.xpath("//a[contains(text(),'Logout')]");
		elementUlDriver.doClick(logout);
		
		
		
		
	}

}
