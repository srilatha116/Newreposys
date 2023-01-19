/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class Static5
{

	static int z=5;//static varaiable 
	int y=1;//global/Instance varaiable
	
	public static void a()//static method
	{
		System.out.println(z);
}
public void b()//non-static methdo
{
	z=20;
	System.out.println(z);
	a();
}
	
public static void main(String[] args) {
	Static5 s5=new Static5();
	s5.a();
	s5.b();
	
}
}
