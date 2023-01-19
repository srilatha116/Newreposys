/**
 * @author Srilatha
 */
package JavaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * @author srilata
 *
 */
public class Verificatioknofscreenshot {
	ScreenshotforFailuetestcase sc=new ScreenshotforFailuetestcase();

@Test

public void open() throws InterruptedException

	{
	System.setProperty("C:\\Users\\srilata\\eclipse-workspace\\Javaselenium\\chromedriver.exe", "webdriver.chrome.driver");
	sc.driver=new ChromeDriver();
	sc.driver.manage().window().maximize();
	sc.driver.get("https://www.facebook.com/");
	
	Thread.sleep(2000);
	sc.driver.findElement(By.id("dsaf")).click();
	Thread.sleep(2000);
	}
	

@AfterMethod
public void takescreeshot(ITestResult result) throws Exception
{
	sc.takescreeshot(result);
}
}

