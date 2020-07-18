package May2020SeleniumSessions.May2020SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
		
		String browser="chrome";
		String url="https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/";
		
		WebDriverFactory wf= new WebDriverFactory();
		WebDriver driver=wf.LaunchBrowsers(browser);
		wf.launchUrl(url);
		
		ElementUtility elmtUtl= new ElementUtility(driver);
		
		By multiSelectionList= By.xpath("//input[@id='justAnInputBox']");
		elmtUtl.doClick(multiSelectionList);
		
		
		By multiList= By.cssSelector("span.comboTreeItemTitle");
		//to select the one value.
		elmtUtl.selectValueWithoutSelectDrop(multiList, "choice 1");
		
		// to select multiple values
		
		elmtUtl.selectMultiChoiceValues(multiList, "choice 1","choice 2 1","choice 6 2 1");
		
		// to select all values.
		elmtUtl.selectAllChoiceValues(multiList, "all");
		
		
	}

}
