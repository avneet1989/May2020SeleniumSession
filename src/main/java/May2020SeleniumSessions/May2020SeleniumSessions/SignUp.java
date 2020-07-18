package May2020SeleniumSessions.May2020SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {

	public static void main(String[] args) {
		String browser="chrome";
		String url="https://www.orangehrm.com/orangehrm-30-day-trial/";
		// becuse webfactory is returning a driver, so we can store this in  webdriver driver reference.wq
		WebDriverFactory wf=new WebDriverFactory();
		WebDriver drive=wf.LaunchBrowsers(browser);
		wf.launchUrl(url);
		
		ElementUtility eu=new ElementUtility(drive);
		By username=By.id("");
		eu.doSendKeys(username, "12345");

	}

}
