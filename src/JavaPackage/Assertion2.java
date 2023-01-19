/**
 * @author Srilatha
 */
package JavaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author srilata
 *
 */
public class Assertion2 {
	
	WebDriver driver;
@Test(groups = "sanity")
public void test5() throws Exception
{
	String excepted ="Sorry, we don't recognize this email.";
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\srilata\\eclipse-workspace\\Javaselenium\\chromedriver.exe");
	WebDriverManager.chromedriver().setup(); 
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://login.yahoo.com/");Thread.sleep(2000);
	driver.findElement(By.id("login-signin")).click();
	
	Thread.sleep(2000);
	
	
	String  actual=driver.findElement(By.id("username-error")).getText();
	
	
		Assert.assertEquals(actual, excepted);
	    System.out.println("assertions passed");
	
}

}
