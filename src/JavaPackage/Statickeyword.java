/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class Statickeyword {
	
	int a=20;
	static int s=40;//declaration of static varaible
	String str="quality engineer";
	
	//function
	public void displayed()
	{
		System.out.println(a);//20
		System.out.println(s);//40
	}
	
	//main method
	public static void main(String[] args) {
		System.out.println(s);//40 should be displayed
		//static variable so without creating object we can directly call the variable
		//System.out.println(a);//Non-static/instance variable so we need to create the object then only we can call the non-static variable in the static method
		
		
		Statickeyword sk=new Statickeyword();//object creation
		System.out.println(sk.a);//20
		sk.displayed();//20 40
		System.out.println(sk.str);//quality engineer
	}

}
