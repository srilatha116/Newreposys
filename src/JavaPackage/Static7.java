/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class Static7 {
String a;
int b;

static int c=5;


public static void add()
{
	System.out.println("hello selenium");
}

public static void main(String[] args) {
	Static7 s7=new Static7();
	s7.a="srilatha";
	s7.b=6;
	add();
	c=19;
	
	System.out.println(s7.a +" "+ s7.b +" "+c);
}

}
