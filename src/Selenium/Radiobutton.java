/**
 * @author Srilatha
 */
package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author srilata
 *
 */
public class Radiobutton {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srilata\\eclipse-workspace\\Javaselenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		
		
		//radio buttons handling by using click method
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		Thread.sleep(3000);
		
		
		List<WebElement> radios=driver.findElements(By.xpath("input[@type='radio']"));
		System.out.println("Number of radio buttons" + radios.size());
		System.out.println(radios.get(1).isDisplayed());
		System.out.println(radios.get(0).isEnabled());
		
		driver.close();
	}

}
