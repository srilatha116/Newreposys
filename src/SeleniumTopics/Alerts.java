/**
 * @author Srilatha
 */
package SeleniumTopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author srilata
 *
 */
public class Alerts {

	// Alerts
	// Alert box
	// Confirm box
	// Prompt box

	@Test (groups = {"srigroup"})
	public void handlingAlertpopups() throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		// handling alertbox
		driver.findElement(By.id("alertBox")).click();
		System.out.println(driver.switchTo().alert().getText());// getting the alert text
		driver.switchTo().alert().accept();// clicking on the ok button
		System.out.println(driver.findElement(By.xpath("//div[text()='You selected alert popup']")).getText());
		driver.quit();

	}

	@Test(groups = {"srigroup"})
	public void handlingConfirmationbox() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement(By.id("confirmBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.xpath("//div[text()='You pressed Cancel in confirmation popup']")).getText());

		driver.quit();

	}
@Test(groups = {"srigroup"})
public void handlingpromptBox() throws Exception
{
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().deleteAllCookies();
driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
WebDriverWait wait = new WebDriverWait(driver, 40);
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Click me')][@id='promptBox']"))).click();
//WebElement promp=driver.findElement(By.xpath("//button[contains(text(),'Click me')][@id='promptBox']"));
//promp.click();
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().sendKeys("srilathakrishna");
driver.switchTo().alert().dismiss();
driver.quit();


}

}
