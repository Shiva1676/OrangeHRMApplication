/**
 * 
 */
package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import browserFactory.StartBrowser;
import configurationFactory.ObjectFactory;
import pages.LoginApp;

/**
 * @author Lenovo
 *
 */
public class Testcase1 {
	
	WebDriver driver;

	@Test
	public void loginPage() {

		driver = StartBrowser.browsers(ObjectFactory.getPropertyClass().getBrowser(), ObjectFactory.getPropertyClass().getURL());
		
		LoginApp login = PageFactory.initElements(driver, LoginApp.class);
		
		login.loginToApp("Admin", "admin123");
	}

}
