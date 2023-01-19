/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class MethodOverloading4 extends MethodOverloading3{

	public static void main(String[] args) {
		//No need of creating object because it is an static method so we can call direcly method name /with the class name
		System.out.println(add(1, 2, 3));
		System.out.println(add(1, 2));
		System.out.println(MethodOverloading3.add(25, 5));
		System.out.println(MethodOverloading3.add(4, 4, 4));
	}
}
