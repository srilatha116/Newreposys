/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class RelationOperator {

	public static void main(String[] args) {
	
		
		int a=100;//local varaiable
		int b=200;//local varaiable
		
		
		if(a<b)
		{
			System.out.println(a);
			
		}
	
		else
		{
			System.out.println(b);
		}
	
	if(a==b)
	{
		System.out.println("both are equal");
	}
	else
	{
		System.out.println("not equal");
	}
	
	
	String a1="ABC";
	String b1="abc";
	
	if(a1.equalsIgnoreCase(b1))
		
	{
		System.out.println("equal");//equal
	}
	else
	{
		System.out.println("not equal");
	}
	if(a1.equals(b1))

	{
		System.out.println("equal");
	}
	else
	{
		System.out.println("not equal");//notequal
	}
	
	}

}
