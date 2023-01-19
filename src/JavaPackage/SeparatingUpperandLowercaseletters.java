/**
 * @author Srilatha
 */
package JavaPackage;


/**
 * @author srilata
 *
 */
public class SeparatingUpperandLowercaseletters {
	public static void main(String[] args) {
		
		
		
		String str="ANASDOIUJHYGBkjhugfvgbnm";
		
		String upper="";
		String lower="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch>=65 && ch<=90)
			{
				upper=upper+ch;
				
			}
			else
			{
				lower=lower+ch;
			}
		}
	System.out.println(upper);
	System.out.println(lower);
	
	}
}
	
		



		
		
		
		
		
		