package May2020SeleniumSessions.May2020SeleniumSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
	
	@Test
	public void getPageTitleTest() {
		doLogin();
		Assert.assertEquals(driver.getTitle(), "CRMPRO");
	
	}
	public void doLogin() {
		driver.findElement(By.name("username")).sendKeys("batchautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	
	

}
