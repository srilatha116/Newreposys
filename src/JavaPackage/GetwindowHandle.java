/**
 * @author Srilatha
 */
package JavaPackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author srilata
 *
 */
public class GetwindowHandle {
@Test
public void initailization() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srilata\\eclipse-workspace\\Javaselenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	Thread.sleep(1000);
	driver.get("http://medhas.walkingtree.tech/");
	Thread.sleep(1000);
	
	//id of parent window
	String parent=driver.getWindowHandle();
	System.out.println(parent);
	driver.findElement(By.xpath("//a[text()='User Manual']")).click();
	//id of child window
	System.out.println(driver.getWindowHandle());
	driver.switchTo().window(parent);
	
	Set <String> element=driver.getWindowHandles();
	System.out.println(element);
	
	Thread.sleep(2000);
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	System.out.println(driver.getTitle());
	System.out.println(driver.hashCode());
	driver.close();
	driver.quit();
	
	
}
}
