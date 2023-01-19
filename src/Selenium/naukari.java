/**
 * @author Srilatha
 */
package Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author srilata
 *
 */
public class naukari {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		String firstwindow=driver.getWindowHandle();
		System.out.println("The first window title is "+ firstwindow +driver.getTitle());
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		driver.getTitle();	driver.findElement(By.xpath("//a[@title='Follow Naukri.com on Facebook']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Follow Naukri.com on Instagram']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Follow Naukri.com on Twitter']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Follow Naukri.com on LinkedIn']")).click();
		Set<String> childwindow=driver.getWindowHandles();//getting all windows handles
		List <String> hlist=new ArrayList<String>(childwindow);//storing in the list	
	}
		
	public void switchtocurrentwindow(String windowtitle ,List<String> list )
	{
		
		
	

	
	
	}}
