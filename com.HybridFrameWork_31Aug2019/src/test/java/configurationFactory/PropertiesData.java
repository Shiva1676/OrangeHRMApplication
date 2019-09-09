/**
 * 
 */
package configurationFactory;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesData {

	Properties pro;

	public PropertiesData() {

		String path = System.getProperty("user.dir")+"/Configuration/Config.properties";

		File src = new File(path);

		try {
			FileInputStream fis = new FileInputStream(src);

			pro = new Properties();

			pro.load(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public String getBrowser() {

		String browser = pro.getProperty("browser");

		return browser;
	}

	public String getURL() {

		String url = pro.getProperty("url");

		return url;
	}
}
