/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class CountcharaterOccurance {

	public static void main(String[] args) {
		String str = "sril athagou thjasda sjgh vssn nnnnn";

		int ts = str.length();

		int slar = str.replaceAll("n", "").length();
		
		int totalcount=ts-slar;
		System.out.println("occurance of the character j --->  "+totalcount);

	}
}


