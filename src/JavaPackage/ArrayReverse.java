/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class ArrayReverse {
public static void main(String agrs[])
{
	int n=123;
	
	int rev=0;
	
	while(n>0)
	{
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	System.out.println(rev);
}
	
}
