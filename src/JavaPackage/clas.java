/**
 * @author Srilatha
 */
package JavaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * @author srilata
 *
 */
public class clas extends BaseClass{

	
@Test
public void lauchurl() throws InterruptedException
{
	WebElement leme=driver.findElement(By.xpath("(//a[@class='nI-gNb-menuItems__anchorDropdown'])[3]"));
leme.click();
Thread.sleep(3000);
String wind=driver.getWindowHandle();
System.out.println(wind);
String title=driver.getTitle();
System.out.println("title of the string ->"+title);

Thread.sleep(3000);


driver.findElement(By.xpath("//a[@class='gnbItemLink MyServices']")).click();
Thread.sleep(2000);


}
}
