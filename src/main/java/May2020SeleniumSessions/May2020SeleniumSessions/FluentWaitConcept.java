package May2020SeleniumSessions.May2020SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;
public class FluentWaitConcept {

	public static void main(String[] args) {
		// fluentwait----dynamic explictly wait
		// a. timeout
		//b. own pollingPeriod
		//c. ignoredException
		//. fluent wait is a class which implementing wait interface.
		
		String browser="firefox";
		String url="https://app.hubspot.com/login";
//		
		WebDriverFactory wf= new WebDriverFactory();
		WebDriver driver=wf.LaunchBrowsers(browser);
		wf.launchUrl(url);
		
		ElementUtility elut=new ElementUtility(driver);
		
		
		
		
		
		
	}

}



