/**
 * @author Srilatha
 */
package JavaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\srilata\\\\eclipse-workspace\\\\Javaselenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://paytm.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Sign In']")).click();
		Thread.sleep(2000);
		
		
		//int allframes=driver.
		driver.switchTo().frame("i");
		Thread.sleep(2000);
		driver.findElement(By.xpath("\"//span[contains (text(),' Watch Video')]\"")).click();
		Thread.sleep(2000);
		
		/*int allframs=driver.findElements(By.id("iframe")).size();*/
	}
}
