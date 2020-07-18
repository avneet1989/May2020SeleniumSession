package May2020SeleniumSessions.May2020SeleniumSessions;

public class AuthontificationPopUp {

	public static void main(String[] args) {
		
		// this is not regular popup/alert. this is called authentification popups.
		// it comes when on open of url it ask for authentification.
		// then we give username and password within the url of the website.
		
	/*	String browser="chrome";
		String url="http://admin:admin@the-internet.herokuapp.com/basic_auth";
		
		WebDriverFactory wf=new WebDriverFactory();
		wf.LaunchBrowsers(browser);
		wf.launchUrl(url);
		System.out.println(wf.getPageTitle());
	*/	
		//or
		
		String browser="chrome";
		
		String username="admin";
		String password="admin";
		WebDriverFactory wf=new WebDriverFactory();
		wf.LaunchBrowsers(browser);
		wf.launchUrl("http://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		wf.getPageTitle();
		wf.doclose();
		
		
		
		
		
		
	}

}
