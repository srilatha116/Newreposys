/**
 * @author Srilatha
 */
package JavaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 * @author srilata
 *
 */
public class BaseClass {
	WebDriver driver;
	ScreenshotforFailuetestcase sf;
	
	
	//stcmt
	@BeforeClass
	public void beforeclass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srilata\\eclipse-workspace\\Javaselenium\\Browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}


	@BeforeMethod
	public void applicaitonlaunch()
	{
		driver.get("http://the-internet.herokuapp.com/nested_frames");
	}
	
	
@AfterClass
public void closebrowser()
{
	driver.quit();
}
	
}
