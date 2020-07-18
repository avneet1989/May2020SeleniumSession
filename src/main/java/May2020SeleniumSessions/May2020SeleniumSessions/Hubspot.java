package May2020SeleniumSessions.May2020SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hubspot {

	public static void main(String[] args) throws InterruptedException {
		String browser="chrome";
		String url="https://app.hubspot.com/login";
		WebDriverFactory wf= new WebDriverFactory();
		WebDriver driver=wf.LaunchBrowsers(browser);
		wf.launchUrl(url);
		Thread.sleep(6000);
		driver.findElement(By.id("username")).sendKeys("bluelibra2k17@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Baltimore2018");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(20000);
		
		String text=driver.findElement(By.cssSelector("h1.private-header__heading.private-header__heading--solo")).getText();
		System.out.println(text);
		
		System.out.println(driver.getTitle());
		String text1=driver.findElement(By.cssSelector("span.account-name ")).getText();
		System.out.println(text1);
		driver.findElement(By.xpath("(//div[@class='private-selectable-box__inner private-selectable-button__inner private-selectable-button__inner--truncatable'])[2]")).click();
		
	}

}
