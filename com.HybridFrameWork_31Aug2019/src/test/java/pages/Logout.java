/**
 * 
 */
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utility.Helper;

/**
 * @author Lenovo
 *
 */
public class Logout {

	WebDriver driver;

	public Logout(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Welcome")
	WebElement welcomeButton;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Logout')]")
	WebElement logoutButton;
	
	public void logoutMethod(){
		
		Helper.waitForWebElement(driver, welcomeButton).click();
		
		Helper.waitForWebElement(driver, logoutButton).click();
	}
	
}
