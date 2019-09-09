/**
 * 
 */
package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

import browserFactory.StartBrowser;
import configurationFactory.ObjectFactory;

/**
 * @author Lenovo
 *
 */
public class BaseClass {

	WebDriver driver;

	ExtentReports report;

	@BeforeSuite
	public void setUpReport() {

		String path = System.getProperty("user.dir") + "/Reports/HRM" + System.currentTimeMillis() + ".html";

		report = new ExtentReports(path);
	}

	@AfterSuite
	public void tearDown() {

		report.flush();
	}

	@BeforeClass
	public void startBrowser() {

		driver = StartBrowser.browsers(ObjectFactory.getPropertyClass().getBrowser(),
				ObjectFactory.getPropertyClass().getURL());
	}

	@AfterClass
	public void closeBrowser() {

		driver.quit();
	}
}
