package May2020SeleniumSessions.May2020SeleniumSessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args)  {
		
		String browser="firefox";
		String url="https://app.hubspot.com/login";
//		String url="https://mail.rediff.com/cgi-bin/login.cgi";
//		String url="https://www.freshworks.com/";
		WebDriverFactory wf= new WebDriverFactory();
		WebDriver driver=wf.LaunchBrowsers(browser);
		wf.launchUrl(url);
		
		ElementUtility elut=new ElementUtility(driver);
		
		By user=By.cssSelector("#username");
//		By password=By.cssSelector("#password");
//		By login=By.cssSelector("#loginBtn");

//		System.out.println(elut.isElementDisplayed(user, 10));
//		elut.doSendKeys(user, "avneet");
		elut.isElementDisplayedAndWork(user, 10).sendKeys("avneet");
		
//		WebDriverWait wait= new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.titleContains("HubSpot Login"));
//		System.out.println(driver.getTitle());
		
		
//		//String pageTitle=doGetPageTitle(driver, 10, "HubSpot Login");
//		//System.out.println(pageTitle);
//		String pageTitle=elut.doGetPageTitle(10, "HubSpot Login");
//		System.out.println(pageTitle);
//		elut.waitForElementPresence(10, user);
//		String urlOfPage=elut.doGetPageCurrentUrl(10, "hubspot");
//		System.out.println(urlOfPage);
//		WebDriverWait wait= new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(user));
	//	waitForElementPresence(driver,10,user);
		
		
//		waitForElementPresence(driver,10, user).sendKeys("avneet@gmail.com");
//		elut.doSendKeys(password, "12345");
//		elut.waitForElementToBeClickable(1,login).click();
		//driver.close();
		
//		WebDriverWait wait= new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.urlContains("hubspot"));
//		System.out.println(driver.getCurrentUrl());
		
		// for alert rediff
		
//		By signIn= By.name("proceed");
////		elut.doClick(signIn);
////		WebDriverWait wait= new WebDriverWait(driver,10);
////		wait.until(ExpectedConditions.alertIsPresent());
////		driver.switchTo().alert().accept();
//		
//		Alert alert=waitForAlertPresent(driver,10);
//		String alertText=alert.getText();
//		System.out.println(alertText);
//		alert.accept();
//		
//		By footorLinks=By.cssSelector("ul.footer-nav>li a");
//		List<WebElement> footorLinksList=elut.VisiblityOfAllElements(10, footorLinks);
//		System.out.println(footorLinksList.size());
//		
//		for(int i=0;i<footorLinksList.size();i++){
//			String text=footorLinksList.get(i).getText();
//			System.out.println(text);
//		}
//		
//		
//
//	}
		
		
		
		
	
	}
	public static String doGetPageTitleWithContains(WebDriver driver, int timeout, String title) {
		WebDriverWait wait= new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
		
	}
	public static String doGetPageTitleWithIsTitle(WebDriver driver, int timeout, String title) {
		WebDriverWait wait= new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
		
	}
	
	public static WebElement waitForElementPresence(WebDriver driver, int timeout, By locator) {
		WebDriverWait wait= new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static String doGetPageCurrentUrl(WebDriver driver, int timeout, String urlval ) {
		WebDriverWait wait= new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.urlContains(urlval));
		return driver.getCurrentUrl();		
	}
	
	public static void waitForElementToBeClickable(WebDriver driver, int timeout, By locator) {
		WebDriverWait wait= new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
			
	}
	
	public static Alert waitForAlertPresent(WebDriver driver, int timeout) {
		WebDriverWait wait= new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	 

}
