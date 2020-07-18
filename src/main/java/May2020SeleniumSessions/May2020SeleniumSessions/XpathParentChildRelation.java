package May2020SeleniumSessions.May2020SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XpathParentChildRelation {

	public static void main(String[] args) throws InterruptedException {
		String browser="chrome";
		String url="https://classic.freecrm.com/index.html";
		WebDriverFactory wf= new WebDriverFactory();
		WebDriver driver=wf.LaunchBrowsers(browser);
		wf.launchUrl(url);
		
		ElementUtility elut= new ElementUtility(driver);
		By username =By.xpath("//input[@name='username']");
		By password =By.xpath("//input[@name='password']");
		By login= By.xpath("//input[@class='btn btn-small']");
		By frame=By.xpath("//frame[@name='mainpanel']");
		By contacts= By.xpath("//a[@title='Contacts']");
		//By nameCheckbox=By.xpath("//a[text()='abhi sahu']//parent::td//preceding-sibling::td/input[@type='checkbox']/..");
		
		elut.doSendKeys(username, "batchautomation");
		elut.doSendKeys(password, "test@12345");
		elut.doClick(login);
		Thread.sleep(5000);
		driver.switchTo().frame(elut.getElement(frame));
		elut.doClick(contacts);
		//elut.doClick(nameCheckbox);
		selectwebTableCheckbox(driver,"Aashiq Limbu");
		System.out.println(getContactPhoneNumber(driver,"Aashiq Limbu"));
		

		
	}
	
	//**************************custon x- path for Webtable****************
	//child to parent
	public static void selectwebTableCheckbox(WebDriver driver,String name) 
	{
		driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td//preceding-sibling::td/input[@type='checkbox']/..")).click();
		
	}

	// child to ancestor
	public static String getContactPhoneNumber(WebDriver driver,String name) {
		return driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td//following::td/span")).getText();
		
	}

}
