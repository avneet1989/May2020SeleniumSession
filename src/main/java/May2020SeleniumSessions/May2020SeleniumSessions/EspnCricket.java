package May2020SeleniumSessions.May2020SeleniumSessions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class EspnCricket {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String browser="chrome";
		String url="https://www.espncricinfo.com/series/14222/scorecard/299004/pakistan-vs-south-africa-1st-test-south-africa-tour-of-pakistan-2007-08";
		WebDriverFactory wf= new WebDriverFactory();
		WebDriver driver=wf.LaunchBrowsers(browser);
		wf.launchUrl(url);
		Thread.sleep(5000);
		
		System.out.println(selectplayerGetWicketter(driver,"HH Gibbs"));
		List<String> playerScoreList=scoreCardOfPlayer(driver,"HH Gibbs");
		System.out.println(playerScoreList);
		
	}
	
	public static String selectplayerGetWicketter(WebDriver driver,String name) 
	{
		WebElement firstScoreCard=driver.findElement(By.xpath("(//div[@class='card content-block match-scorecard-table'])[1]"));
		String wickettakerName=firstScoreCard.findElement(By.xpath("//a[text()='"+name+"']//parent::td//following-sibling::td//span")).getText();
		return wickettakerName;
	}

	public static List<String> scoreCardOfPlayer(WebDriver driver,String name) 
	{
		List<String> allScore=new ArrayList<String>();
		WebElement firstScoreCard=driver.findElement(By.xpath("(//div[@class='card content-block match-scorecard-table'])[1]"));
		
	List<WebElement> score=firstScoreCard.findElements(By.xpath("(//a[text()='HH Gibbs'])[1]//parent::td//following-sibling::td//following-sibling::td"));
		for(int i=0;i<score.size();i++) {
			String text=score.get(i).getText();
			allScore.add(text);
		}
		return allScore;
		
	}

	

}
