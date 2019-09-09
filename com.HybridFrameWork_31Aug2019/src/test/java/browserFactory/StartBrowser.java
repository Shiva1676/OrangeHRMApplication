/**
 * 
 */
package browserFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author Lenovo
 *
 */
public class StartBrowser {

	static WebDriver driver;

	public static WebDriver browsers(String browser, String url) {

		if (browser.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();

			driver.manage().window().maximize();

		} else if (browser.equalsIgnoreCase("Firefox")) {

			driver = new FirefoxDriver();

			driver.manage().window().maximize();

		} else if (browser.equalsIgnoreCase("ie")) {

			driver = new InternetExplorerDriver();

			driver.manage().window().maximize();

		}

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
		/*Set<Cookie> set = driver.manage().getCookies();
		
		for(Cookie cookie: set){
			
			System.out.println(cookie.getName() +  " " + cookie.getValue());
		}*/
		
//		driver.manage().deleteAllCookies();

		return driver;

	}

}
