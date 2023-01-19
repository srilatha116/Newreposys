/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class CountofUpperandLower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s="Welcome to Automation";
		int upper=0;
		int lower=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch>=65 && ch<=90)
			{
				upper++;
			}
		
			else
			{
				lower++;
			}
		}
System.out.println("String Length : "+s.length());

System.out.println("Uppercase letters --> "+upper);
System.out.println("Lowercase letters --> "+lower);


	}

}











