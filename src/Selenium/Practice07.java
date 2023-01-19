/**
 * @author Srilatha
 */
package Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice07 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srilata\\eclipse-workspace\\Javaselenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://medhas.walkingtree.tech/");
	driver.findElement(By.linkText("userManual")).click();
	Thread.sleep(3000);
	
	
String currentwindow=driver.getWindowHandle();
System.out.println(currentwindow);

Set <String> childwindow=driver.getWindowHandles();
for(String handle:childwindow)
{
	System.out.println(handle);
}


driver.switchTo().window(currentwindow);
Thread.sleep(2000);
	driver.quit();
	
}
}
