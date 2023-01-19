/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class Splitstring {

	public static void main(String[] args) {
		
		String str="srilatha 2345 goutham prassan";
		
		
	String[] strs=str.split("\\s");
	
	for(String output:strs)
	{
		System.out.println(output);
		
	}
	}
}
