/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class CountofUpperandlowerletters {
	public static void main(String[] args) {
		String str = "sdafghjSFDGHJHJUI";

		int upper = 0, lower = 0;
		char ch = 0;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch >= 65 && ch <= 90) {

				upper++;
			}

			else {

				lower++;
			}
		}
		System.out.println(upper);
		System.out.println(lower);

	}

}
