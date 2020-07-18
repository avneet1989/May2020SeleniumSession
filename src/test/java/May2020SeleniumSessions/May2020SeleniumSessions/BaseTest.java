package May2020SeleniumSessions.May2020SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	String browser="chrome";
	
	@Parameters("browser")
	@BeforeTest
	public void setUp() {
		if(browser.equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
		}
	
	else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
				}
	else {
		System.out.println("please pass the correct browser: "+ browser);
	}
		
	driver.get("https://classic.crmpro.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
}
