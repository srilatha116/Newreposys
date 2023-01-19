/**
 * @author Srilatha
 */
package Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author srilata
 *
 */
public class Getwindowhandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srilata\\eclipse-workspace\\Javaselenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.kotak.com/en/home.html");

		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		//getwindowhandle() method
		String Parentwindow = driver.getWindowHandle();
		System.out.println("Current window" + Parentwindow);
		System.out.println(driver.getTitle());
		
//getwindowhandles method()
		Set <String> handle=driver.getWindowHandles();
		for(String childwindow:handle)
		{
			System.out.println(childwindow);
		}
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.switchTo().window(Parentwindow);
		driver.findElement(By.xpath("//ul[@class='left-nav clearfix']//a[normalize-space()='PRIVATE BANKING']")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
	}

}
