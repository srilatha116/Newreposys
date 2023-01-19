/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class Removingthespecialcharatercs {
	public static void main(String[] args) {
		
	//Removed specail characters fro the given string
String str="sadfbg&&&&&&&&&&&&&&&&&&34@@@@@@@@@@@@@jnhbgvfcx******";

String stre=str.replaceAll("[^a-zA-Z-0-9]","");
System.out.println(stre);
			
			
	
	}
}
