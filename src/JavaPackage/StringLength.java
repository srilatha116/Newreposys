/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class StringLength {

	public static void main(String[] args) {
	String str1="SRILATHA";
	
	String str2="srilatha";
	
	//string length
	System.out.println(str1.length());//8
	System.out.println(str2.length());//8

	
	
	//converting to upper case to lower and lower case to upper
	
	System.out.println("upper case is converting to lo  " +str1.toLowerCase());//srilatha
	System.out.println("Lower cases is converting to uppercase " +str2.toUpperCase());//SRILATHA

	//String comparison 
	if(str1.equalsIgnoreCase(str2))
	{
		System.out.println("booth are equal");//Both are equal
	}
	else {
		System.out.println("Both are not equal");
	}
	
	
if(str1==str2)
		
	{
		System.out.println("str1 is equal to str2");
	}
	else
		System.out.println("str1 is not equals to str2");//not equal
	}

}
