package May2020SeleniumSessions.May2020SeleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementLocatorsclass2 {
	
	
	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\14387\\OneDrive\\Documents\\TESTING from udemy\\all drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		
		driver.get("https://login.yahoo.com/?.src=ym&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
		Thread.sleep(2000);
		
		
		/**
		 * 1.
		driver.findElement(By.id("login-username")).sendKeys("avneet");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		//driver.close();
		driver.quit();
		
		// to open the new window again.
		
		driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		*/
		
		/**
		 * 2. making the WebElement so that you can access it any time.
		 */
	/*	
		WebElement username=driver.findElement(By.id("login-username"));
		WebElement loginButton=driver.findElement(By.id("login-signin"));
		WebElement password=driver.findElement(By.id("login-passwd"));
	
		username.sendKeys("avneet@gmail.com");
		loginButton.click();
		password.sendKeys("admin");
		*/
		// this way u can use it as many time and anywher but for that i need to create the webelemt for each element.
		
	/*	
		// 3. way make the element is by. class
		
		By userName=By.id("login-username");
		By loginButton=By.id("login-signin");
		By password=By.id("login-passwd");
		
							// now on base of my class i will make webdriver which i need 
		
		driver.findElement(userName).sendKeys("avneet@gmail.com");
		driver.findElement(loginButton).click();
		driver.findElement(password).sendKeys("avneet@gmail.com");
		*/
		
	//4. by creating the method outside the class
		// we make them locator
	//	By userName=By.id("login-username");
	//	By loginButton=By.id("login-signin");
	//	By password=By.id("login-passwd");
		
	//	getElement(userName).sendKeys("admin@gmail.com");
	//	getElement(loginButton).click();
	
	//5. on the basic of methods
		// 1. create the by. locators
		//2. make methods
		//3. call those methods by passing the values
		
		By userName=By.id("login-username");
		By loginButton=By.id("login-signin");
		By password=By.id("login-passwd");
		
		doSendKeys(userName, "avneet");
		doClick(loginButton);
	
	}
	
	// 4.  by making the  method 
	//this methos is used to create the webelement on the basis of given BY locator
	
	public static WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
		
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	

}
