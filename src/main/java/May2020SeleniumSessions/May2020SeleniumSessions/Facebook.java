package May2020SeleniumSessions.May2020SeleniumSessions;

import org.openqa.selenium.By;


public class Facebook {


	public static void main(String[] args) throws InterruptedException {
	
		String browser="chrome";
		String url="https://www.facebook.com/";
	WebDriverFactory wf=new WebDriverFactory();
	wf.LaunchBrowsers(browser);
	wf.launchUrl(url);
	String pageCurrenturl=wf.getPageCurrentUrl();
	System.out.println(pageCurrenturl);
	String pageTitle=wf.getPageTitle();
	System.out.println(pageTitle);
	

	By userName=By.id("email");
	By password=By.id("pass");
	
	By day=By.xpath("//select[@id='day']/option");
	By month=By.xpath("//select[@id='month']/option");
	By year=By.xpath("//select[@id='year']/option");
	
	
	By login=By.id("loginbutton");
	
	wf.doSendKeys(userName, "aveet");
	wf.doSendKeys(password, "123456");
	
	//wf.withoutSelectclassPrint(day);
	//wf.withoutSelectclassPrint(month);
	//wf.withoutSelectclassPrint(year);
	String dob="18-feb-1989";
	wf.selectValueWithoutSelectDrop(day, dob.split("-")[0]);
	wf.selectValueWithoutSelectDrop(month, dob.split("-")[1]);
	wf.selectValueWithoutSelectDrop(year, dob.split("-")[2]);
	
	wf.doClick(login);
	
	Thread.sleep(3000);
	wf.doclose();

	}

}
