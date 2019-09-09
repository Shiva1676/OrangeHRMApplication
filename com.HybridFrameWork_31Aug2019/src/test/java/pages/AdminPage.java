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
public class AdminPage {

	WebDriver driver;

	public AdminPage(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//b[contains(text(),'Admin')]")
	WebElement adminButton;

	@FindBy(how = How.XPATH, using = "//input[@id='btnAdd']")
	WebElement addButton;

	@FindBy(how = How.ID, using = "systemUser_employeeName_empName")
	WebElement empName;

	@FindBy(how = How.ID, using = "systemUser_userName")
	WebElement userName;

	@FindBy(how = How.ID, using = "systemUser_password")
	WebElement password;

	@FindBy(how = How.ID, using = "systemUser_confirmPassword")
	WebElement confirmPassword;

	@FindBy(how = How.XPATH, using = "//input[@id='btnSave']")
	WebElement saveButton;

	public void getAdminPageDetails(String eName, String uName, String pass, String confPassword)
			throws InterruptedException {

		Helper.waitForWebElement(driver, adminButton).click();

		Helper.waitForWebElement(driver, addButton).click();

//		empName.clear();

		Helper.waitForWebElement(driver, empName).sendKeys(eName);

		System.out.println(eName);

//		userName.clear();

		Helper.waitForWebElement(driver, userName).sendKeys(uName);

		System.out.println(uName);

//		password.clear();

		Helper.waitForWebElement(driver, password).sendKeys(pass);

		System.out.println(pass);

//		confirmPassword.clear();

		Helper.waitForWebElement(driver, confirmPassword).sendKeys(confPassword);

		System.out.println(confPassword);

		try {
			Helper.waitForWebElement(driver, saveButton).click();
			
			System.out.println("Clicked and saved successfully");
			
		} catch (Exception e) {
			System.out.println("Not saved");
			System.out.println(e.getMessage());
		}

	}

}
