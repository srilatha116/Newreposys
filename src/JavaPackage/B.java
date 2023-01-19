/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class B {
	
	 int a=5;
	 static String str="srilatha";
	 String str2="krishna";
	 String str3="goutham";
	 String str4="prassana";
	 
	 static int b=23;
	 
	 public static void displayed()
	 {
		 System.out.println(b);
	 }
	 
	 public void nonss()
	 {
		 System.out.println("am a non static method");
	 }
	public static void main(String args[])
	{
		
		B ob=new B();
		
		//System.out.println("The values of a values is-->"+ob.a);
		System.out.println("Letter of Srilatha -> "+str.length());
		System.out.println("Letter of krishna -> "+ob.str2.length());
		System.out.println("Letter of goutham -> "+ob.str3.length());
		System.out.println("Letter of prassana -> "+ob.str4.length());
		
		displayed();
		ob.nonss();
		
	}

}
