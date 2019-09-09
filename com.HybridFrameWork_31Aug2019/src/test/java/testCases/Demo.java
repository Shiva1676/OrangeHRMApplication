/**
 * 
 */
package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import browserFactory.StartBrowser;
import configurationFactory.ObjectFactory;

/**
 * @author Lenovo
 *
 */
public class Demo {

	WebDriver driver;

	@Test
	public void test() {

		driver = StartBrowser.browsers(ObjectFactory.getPropertyClass().getBrowser(),
				ObjectFactory.getPropertyClass().getURL());
	}
}
