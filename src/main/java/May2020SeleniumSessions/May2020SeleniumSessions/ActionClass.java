package May2020SeleniumSessions.May2020SeleniumSessions;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
	String browser="chrome";
	String url="https://jqueryui.com/resources/demos/droppable/default.html";
	
	WebDriverFactory wf=new WebDriverFactory();
	WebDriver driver=wf.LaunchBrowsers(browser);
	wf.launchUrl(url);

	ElementUtility emtUtl= new ElementUtility(driver);
	//By leftClick=By.xpath("//div[@id='draggable']");
	//By dropLoaction=By.xpath("//div[@id='droppable']");
	WebElement leftClick=driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement dropLocation=driver.findElement(By.xpath("//div[@id='droppable']"));
	Actions ac=new Actions(driver);
	//ac.clickAndHold(leftClick).perform();
	ac.dragAndDrop(leftClick, dropLocation).build().perform();
	
	driver.navigate().to("https://www.google.com/");
	
	WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
	
	Actions ac1=new Actions(driver);
	ac1.click(search).sendKeys("seleni").build().perform();
	Thread.sleep(3000);
	search.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	
	
	}

}
