/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class Requiredinformation {
public static void main(String args[])
{
	String str="123NCR45ncr678Ncr9";


	String getsrting=str.replaceAll("[^a-zA-Z]","");

	System.out.println(getsrting);

	String getsrting1=str.replaceAll("[^0-9]","");
	System.out.println(getsrting1);
	String getsrting2=str.replaceAll("[^a-z]","");
	System.out.println(getsrting2);

	String getsrting3=str.replaceAll("[^A-Z]","");
	System.out.println(getsrting3);
	String getsrting4=str.replace("[^0-9A-Z]","");
	System.out.println(getsrting4);
	String getsrting5=str.replace("[^0-9a-z]","");
	System.out.println(getsrting5);
}
}
