package May2020SeleniumSessions.May2020SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArrayListValue {

	public static void main(String[] args) throws InterruptedException {
		String browser="chrome";
		String url="https://www.google.com/";
		WebDriverFactory wf= new WebDriverFactory();
		WebDriver driver=wf.LaunchBrowsers(browser);
		wf.launchUrl(url);
		
		ElementUtility elmtutl= new ElementUtility(driver);
		
		By autoSearch= By.name("q");
		elmtutl.doSendKeys(autoSearch, "Selenium");
		Thread.sleep(3000);
		By autoSelect=By.xpath("//ul[@class='erkvQe']/li//span");
		List<String> autoSearchList=elmtutl.ArrayListPrint(autoSelect);
		System.out.println(autoSearchList);
		
		driver.navigate().to("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry=By.xpath("//select[@id='Form_submitForm_Industry']");
		elmtutl.doClick(industry);
		By industryOption=By.xpath("//option[contains(text(),'Agriculture')]");
		elmtutl.doClick(industryOption);
		
		
		
	}

}
