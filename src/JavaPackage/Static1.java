/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class Static1 {

int a=10;
String s="latha";
static int b=20;

public void displayed()
{
	System.out.println(s);
}
public static void main(String[] args) {
		Static1 s =new Static1();
		System.out.println(s.a);
		s.displayed();
		

	}

}
