/**
 * @author Srilatha
 */
package Selenium;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author srilata
 *
 */
public class Hyr  {
	

	
public WebDriver driver;
	@Test
	public void multiplewin() throws Exception 
	{
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("https://www.hyrtutorials.com/");
	String firstwin=driver.getWindowHandle();
    System.out.println("FirstWindow -"+ firstwin + driver.getTitle());
    WebElement seleniumte=driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
    Actions acti=new Actions(driver);
    acti.moveToElement(seleniumte);
    acti.build().perform();
    Thread.sleep(2000);
    WebElement  windowtitle=driver.findElement(By.xpath("//a[text()='Window Handles']"));
   windowtitle.click();
   Thread.sleep(2000);
    System.out.println("Second window Title "+ windowtitle +driver.getTitle());
    Thread.sleep(2000);
	driver.close();
	}
	
	
}