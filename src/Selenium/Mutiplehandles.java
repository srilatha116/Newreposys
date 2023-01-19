/**
 * @author Srilatha
 */
package Selenium;

import java.sql.Time;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author srilata
 *
 */
public class Mutiplehandles {

	@Test
	public void mainmutiplewind() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.kotak.com/en/home.html");
		String parentwind=driver.getWindowHandle();
		System.out.println(parentwind);
		Thread.sleep(2000);
		//clickon on login button
		
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(parentwind);
		
		driver.findElement(By.xpath("//a[text()='Open Account']")).click();
		Thread.sleep(2000);
		
		Set <String> listofwin=driver.getWindowHandles();
		
		
		for(String listofchil : listofwin)
		{
			if(!parentwind.equals(listofwin))
				driver.switchTo().window(listofchil);
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
			System.out.println(listofchil);
			driver.findElement(By.xpath("//input[@id='pincode']")).sendKeys("2345678");

		
		}
		
		driver.quit();
		
	}
}
