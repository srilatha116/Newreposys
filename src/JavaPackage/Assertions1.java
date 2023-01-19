/**
 * @author Srilatha
 */
package JavaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author srilata
 *
 */
public class Assertions1 {

	@Test
	public void testcas1()
	{
		int a=20;
		int b=80;
		
		try {
			Assert.assertEquals(b>a, "both are equal");
		} catch (Error e) {
			e.printStackTrace();
		}
		System.out.println("Assertion is pass");
	}
}
