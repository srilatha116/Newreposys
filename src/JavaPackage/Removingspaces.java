/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class Removingspaces {

	public static void main(String[] args) {
		String str="java123inka34ncrchalaSDFGkastam";
		
		String strs="NCR123ncr23n34cr";
		
		System.out.println("Before removing the spaces ->"+str);
		str=str.replaceAll("\\s", "");
		System.out.println("After removing the spaces ->"+str);
		
		
		//String spe=str.replaceAll(str, "[^a-zA-Z-0-9]");

String strsd=strs.replaceAll("[^a-z0-9]", "");
System.out.println(strsd);
	}




}
