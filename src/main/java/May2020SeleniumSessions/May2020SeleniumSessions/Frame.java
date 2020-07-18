package May2020SeleniumSessions.May2020SeleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser="chrome";
		String url="https://jqueryui.com/draggable/";
		
		WebDriverFactory wf=new WebDriverFactory();
		WebDriver driver=wf.LaunchBrowsers(browser);
		wf.launchUrl(url);
		
		ElementUtility elementUtl= new ElementUtility(driver);
			
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		By dragDisplay=By.id("draggable");
		
		
		System.out.println(elementUtl.doIsDisplay(dragDisplay));
		
	
		
		driver.switchTo().defaultContent();
		By supportLink=By.linkText("Support");
		elementUtl.doClick(supportLink);
		
		
	}
	
	

}
