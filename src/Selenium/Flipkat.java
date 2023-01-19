/**
 * @author Srilatha
 */
package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author srilata
 *
 */
public class Flipkat {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srilata\\eclipse-workspace\\Javaselenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);

		System.out.println(driver.getTitle());

		WebElement serach = driver
				.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		serach.sendKeys("laptop");
		serach.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		List <WebElement> checckall=driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(2000);
System.out.println("number of check boxes are" +Integer.toString(checckall.size()));
for(WebElement cb:checckall)
{
	cb.click();
}
System.out.println("checked all boxes");
	}	
}