/**
 * @author Srilatha
 */
package JavaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartradio {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\srilata\\\\eclipse-workspace\\\\Javaselenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'_3704LK')]")).sendKeys("Laptops");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'L0Z3Pu')]")).click();
		Thread.sleep(1000);

		List<WebElement> checkboxes = driver.findElements(By.xpath("//div[contains(@class,'_3879cV')]"));
		System.out.println("Total numbers of Checkboxes are " + checkboxes.size());
		Thread.sleep(5000);
		
		
		for(WebElement ch:checkboxes)
		{
			ch.click();
			
		}
		System.out.println("All checkboxes are checked");
		/*for(int i=0; i<=checkboxes.size(); i++)
		{
			
			 * if(checkboxes.get(i).isDisplayed()&& checkboxes.get(i).isDisplayed())
			 			{
                   System.out.println("Checkbox is displayed at index : " + i + " Clicking on it now");
                        checkboxes.get(i).click();*/
			}


}
