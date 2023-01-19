/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class Countevenoddnumbers {
	public static void main(String[] args) {
		
		int num=777824;
		
		int evencount=0, oddcoun=0;
		
		while(num>0)
		{
			
			
			
			if(num%2==0)
				
				{
			
				evencount++;
				}
			else
			{
				
				oddcoun++;
			}
		num=num/10;
		}
		System.out.println("even "+evencount);
		System.out.println("Odd " +oddcoun);
	}

}
