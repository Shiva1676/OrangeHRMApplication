/**
 * 
 */
package testCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import configurationFactory.ObjectFactory;
import getterAndSetterPages.Admin_Getter_Setter;
import getterAndSetterPages.Login_Getter_Setter;
import pages.AdminPage;
import pages.LoginApp;
import pages.Logout;

/**
 * @author Lenovo
 *
 */
public class EndToEndScenario extends BaseClass {

	@Test
	public void hrmTestCase() throws InterruptedException {

		LoginApp login = PageFactory.initElements(driver, LoginApp.class);

		AdminPage admin = PageFactory.initElements(driver, AdminPage.class);

		Logout logout = PageFactory.initElements(driver, Logout.class);

		int rows_Sheet1 = ObjectFactory.getExcelClass().getRowCount("Sheet3");

		// int columns_Sheet1 =
		// ObjectFactory.getExcelClass().getColumnCount("Sheet1");

		int rows_Sheet2 = ObjectFactory.getExcelClass().getRowCount("Sheet3");

		// int columns_Sheet2 =
		// ObjectFactory.getExcelClass().getColumnCount("Sheet2");

		List<Login_Getter_Setter> loginDetails = new ArrayList<Login_Getter_Setter>();

		List<Admin_Getter_Setter> adminDetails = new ArrayList<Admin_Getter_Setter>();

		for (int i = 0; i < rows_Sheet1; i++) {
			Login_Getter_Setter user = new Login_Getter_Setter();

			user.setUsername(ObjectFactory.getExcelClass().getData("Sheet3", i, 0));
			user.setPassword(ObjectFactory.getExcelClass().getData("Sheet3", i, 1));
			loginDetails.add(user);
		}

		for (int i = 0; i < rows_Sheet2; i++) {
			Admin_Getter_Setter contactDetails = new Admin_Getter_Setter();

			contactDetails.setEmployeeName_admin(ObjectFactory.getExcelClass().getData("Sheet4", i, 0));
			contactDetails.setUserName_admin(ObjectFactory.getExcelClass().getData("Sheet4", i, 1));
			contactDetails.setPassword_admin(ObjectFactory.getExcelClass().getData("Sheet4", i, 2));
			contactDetails.setConfirmPassord_admin(ObjectFactory.getExcelClass().getData("Sheet4", i, 3));
			adminDetails.add(contactDetails);
		}

		for (int i = 0; i < rows_Sheet2; i++) {
			try {
				Login_Getter_Setter user = loginDetails.get(i);
				Admin_Getter_Setter contacts = adminDetails.get(i);

				login.loginToApp(user.getUsername(), user.getPassword());

				System.out.println("loop userId : " + user.getUsername() + "loop passwored : " + user.getPassword());

				admin.getAdminPageDetails(contacts.getEmployeeName_admin(), contacts.getUserName_admin(),
						contacts.getPassword_admin(), contacts.getConfirmPassord_admin());

				System.out.println("employeeName" + contacts.getEmployeeName_admin() + " userName : "
						+ contacts.getUserName_admin() + " password : " + contacts.getPassword_admin()
						+ "confirm Password" + contacts.getConfirmPassord_admin());

				Thread.sleep(1000);

				logout.logoutMethod();

			} catch (Exception e) {
				System.out.println("Username & password are credentials");
			}
		}

	}

}
