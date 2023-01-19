/**
 * @author Srilatha
 */
package JavaPackage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;

/**
 * @author srilata
 *
 */
public class ScreenshotforFailuetestcase {

	WebDriver driver;

	@Test
	public void takescreeshot(ITestResult result) throws Exception {

		if (ITestResult.FAILURE == result.getStatus()) {

			TakesScreenshot ts = (TakesScreenshot) driver;

			File sourcefil = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcefil, new File("./screenshots/" +result.getName() +".png"));
		System.out.println(result.getName() + "method() screeenshot captured.");
		
		}
	
	
	}
}
