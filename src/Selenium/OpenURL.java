/**
 * @author Srilatha
 */
package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * @author srilata
 *
 */
public class OpenURL {
	public static void main(String[] args) {

		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\srilata\\eclipse-workspace\\Javaselenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//Creating the driver instance for the webdriver instance with the help of chromedriver class
driver.get("https://www.facebook.com");
driver.quit();

	}

}
