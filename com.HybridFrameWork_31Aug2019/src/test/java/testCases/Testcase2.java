/**
 * 
 *//*
package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import configurationFactory.ExcelDataFactory;
import configurationFactory.ObjectFactory;
import pages.LoginApp;
import utility.Helper;

*//**
 * @author Lenovo
 *
 *//*
public class Testcase2 extends BaseClass {

	// WebDriver driver;
	boolean status = false;
	ExtentTest logger;

	@BeforeMethod
	public void reportingSetUp() {

		logger = report.startTest("============HRM Application============");

	}

	@AfterMethod
	public void tearDown(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {

			logger.log(LogStatus.FAIL, logger.addScreenCapture(Helper.getScreenCapture(driver)));

		}

		report.endTest(logger);
	}

	@Test
	public void loginPage() {

		LoginApp login = PageFactory.initElements(driver, LoginApp.class);

		ObjectFactory.getExcelClass();

		int rows = ExcelDataFactory.getRowCount("Sheet2");

		int columns = ExcelDataFactory.getColumnCount("Sheet2");

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < columns - 1; j++) {

				status = login.loginToApp(ExcelDataFactory.getData("Sheet2", i, j),
						ExcelDataFactory.getData("Sheet2", i, j + 1));

				if (status == true) {

					logger.log(LogStatus.PASS, logger.addScreenCapture(Helper.getScreenCapture(driver)));
				}else{
					logger.log(LogStatus.FAIL, logger.addScreenCapture(Helper.getScreenCapture(driver)));
				}

			}

		}
		 Assert.assertTrue(status);
	}

}
*/