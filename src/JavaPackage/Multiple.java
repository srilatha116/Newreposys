/**
 * @author Srilatha
 */
package JavaPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author srilata
 *
 */
public class Multiple {

	WebDriver driver;
	
	@Test
	public void mul() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("http://www.naukri.com/");
		Thread.sleep(2000);
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		Set <String>s=driver.getWindowHandles();
		System.out.println(s);
		
		Iterator <String> ls=s.iterator();
		while(ls.hasNext())
		{

		String child_window=ls.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());

		driver.close();
		}

		}
		//switch to the parent window
		driver.switchTo().window(parent);
		
	}
}
