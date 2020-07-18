package May2020SeleniumSessions.May2020SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowsers {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		// to run the code without browser for that we have to give one class called ChromeOptions.
		FirefoxOptions fo= new FirefoxOptions();
		//ChromeOptions co=new ChromeOptions();
		//co.addArguments("--headless");
		fo.addArguments("--headless");
	//	WebDriver driver=new ChromeDriver(co);
		WebDriver driver=new FirefoxDriver(fo);
		String expectedTitle="Facebook - Log In or Sign Up";
		
		driver.get("https://www.facebook.com/");
		// verfication or checkpoints to check expected vs actual.
		String expectedUrl="https://www.facebook.com/";
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("titel is correct");
			
		}
		else{
			System.out.println("Title is wrong");
		}
		
		
		//to verify the url
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("facebook")) {
			System.out.println("url is correct");
		}
		else {
			System.out.println("enter the right url");
		}
		
		
		
		//or
		String actualUrl=driver.getCurrentUrl();
		if(actualUrl.equals(expectedUrl)) {
			System.out.println("url is correct");
			
		}
		else{
			System.out.println("Url is wrong");
		}
		
		
		
		
		
		driver.close();

	}

}
