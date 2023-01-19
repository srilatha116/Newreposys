/**
 * @author Srilatha
 */
package SeleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import bsh.commands.dir;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author srilata
 *
 */
public class Xpath {

	@Test
	public void absoluteXpath() throws Exception
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://www.w3schools.com/");
//Absolutexpath
//driver.findElement(By.xpath("/html/body/div[3]/a[4]")).click();
//Relative xpath
driver.findElement(By.xpath("//a[@id='navbtn_exercises']")).click();
Thread.sleep(1000);
driver.quit();
	}
	@Test
	public void attributeXpatha() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='fa fa-logo']")).click();
		driver.quit();
	}
	}

