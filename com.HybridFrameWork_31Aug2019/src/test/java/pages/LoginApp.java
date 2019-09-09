/**
 * 
 */
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utility.Helper;

public class LoginApp {

	WebDriver driver;

	public LoginApp(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(how = How.ID, using = "txtUsername")
	WebElement username;

	@FindBy(how = How.ID, using = "txtPassword")
	WebElement password;

	@FindBy(how = How.ID, using = "btnLogin")
	WebElement submitButton;

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Welcome")
	WebElement welcomeButton;

	@FindBy(how = How.XPATH, using = "//span[@id='spanMessage']")
	WebElement invalidCredential;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Logout')]")
	WebElement logOutButton;

	public boolean loginToApp(String uname, String pass) {

//		username.clear();

		Helper.waitForWebElement(driver, username).sendKeys(uname);
		
//		password.clear();

		Helper.waitForWebElement(driver, password).sendKeys(pass);

		System.out.println(uname + " " + pass);

		Helper.waitForWebElement(driver, submitButton).click();

		
		boolean status = false;

		try {
			status = Helper.waitForWebElement(driver, welcomeButton).isDisplayed();

			System.out.println("Successfully logged in");

//			Helper.waitForWebElement(driver, welcomeButton).click();
//
//			Helper.waitForWebElement(driver, logOutButton).click();

		} catch (Exception e) {

			String errMsg = invalidCredential.getAttribute("innerHTML");

			System.out.println("Credentials are:" + errMsg);

		}

		return status;
	}

}
