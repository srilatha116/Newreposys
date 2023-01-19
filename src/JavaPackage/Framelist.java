/**
 * @author Srilatha
 */
package JavaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * @author srilata
 *
 */
public class Framelist extends BaseClass {

	
	@Test
	public void listframes()
	{
		
		List <WebElement> ls=driver.findElements(By.tagName("frame"));
		System.out.println(ls.size());
		
		
		String str="my name is srilatha";
		String[] str4=str.split(" ",2);
	      System.out.println(str4);
	}
}
