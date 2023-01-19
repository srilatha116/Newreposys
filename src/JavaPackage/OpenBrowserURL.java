/**
 * @author Srilatha
 */
package JavaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

/**
 * @author srilata
 *
 */
public class OpenBrowserURL {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		// setting the property of chrome browser and passing the chrome driver path
		System.setProperty("webdriver.driver.chrome",
				"C:\\Users\\srilata\\eclipse-workspace\\Javaselenium\\chromedriver.exe");
		// launchin chrome driver instance
		WebDriver driver = new ChromeDriver();
		// maximize()-maximize the window
		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// get()-Launching the application
		driver.get("https://www.facebook.com");// Launching the site
		Thread.sleep(3000);
		// Navigate()-Launching the application
		driver.get("http://medhas.walkingtree.tech/");
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.linkText("User Manual"));
		link.click();
		Thread.sleep(3000);
		
		Assert.e

		String window = driver.getWindowHandle();
		driver.switchTo().window(window);

		Thread.sleep(2000);
		// Refresh the page
		driver.navigate().refresh();
		Thread.sleep(1000);
		// Navigate to back
		driver.navigate().back();
		Thread.sleep(3000);

		// Navigate to forward
		driver.navigate().forward();
		Thread.sleep(3000);

		// Navigate to back
		driver.navigate().back();
		Thread.sleep(3000);

		// Title of the page
		String title = driver.getTitle();
		System.out.println(title);

		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		Thread.sleep(1000);

		/*
		 * driver.findElement(By.
		 * xpath("//div[@class='_6ltg'][contains(.,'Create New Account')]")).click();
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(
		 * "Srilatha"); Thread.sleep(2000);
		 * 
		 * 
		 * driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Macherla"
		 * ); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(
		 * "2345122334"); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys(
		 * "df89g34"); Thread.sleep(5000);
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"day\"]/option[3]")).click();
		 * Thread.sleep(5000);
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"month\"]/option[2]")).click();
		 * Thread.sleep(4000);
		 * driver.findElement(By.xpath("//*[@id=\"year\"]/option[34]")).click();
		 * Thread.sleep(4000);
		 * 
		 * driver.findElement(By.xpath("(//input [@type='radio'])[1]")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("(//button [@name='websubmit'])[1]")).click();
		 * Thread.sleep(3000); driver.quit();
		 */
	}

}
