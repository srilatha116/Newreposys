/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */

//child class                           parentclass
public class MethodOverloading2 extends MethodOverloading1{

	public void add(double a,double b)
			{
		System.out.println(a+b);
			}
	public static void main(String[] args) {
		//object for child class
		MethodOverloading2 m2=new MethodOverloading2();
		m2.add(1.2, 3.2);
		m2.add(2.3, 2.3);
		m2.add(2, 2);
		
	}

}
