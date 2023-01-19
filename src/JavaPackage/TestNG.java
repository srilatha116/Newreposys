/**
 * @author Srilatha
 */
package JavaPackage;

import org.testng.annotations.*;

/**
 * @author srilata
 *
 */
public class TestNG {
	
	//Beforesuite
	//BeforeTest
	//Beforeclass
	//Beforemethod
	//test
	//Aftermethod
	//Afterclass
	//AfterTest
	//Aftersuite
	
@Test(groups = "regression")
	public void a()
	{
		System.out.println("a method");
	
	}



@Test(groups = { "regression","Sanity"})
public void frege()
{
	System.out.println("a method");

}
@BeforeSuite
	public void b()
	{
		System.out.println("b method");
	
	}
@BeforeTest
	public void c()
	{
		System.out.println("c method");
	
	}


@Test(groups = { "sanity"})
public void amsanity()
{
	System.out.println("am sanity method");

}
@BeforeClass
public void d()
{
	System.out.println("d method");

}
@BeforeMethod
public void e()
{
	System.out.println(" e method");

}
@AfterClass
public void f()
{
	System.out.println("f method");

}
@AfterMethod
public void g()
{
	System.out.println("g method");

}
@AfterSuite
public void h()
{
	System.out.println("h method");

}
@AfterTest
public void i()
{
	System.out.println("i method");

}

@Test(enabled=false)
public void j()
{
	System.out.println("j method");
}
public static void main()
{
	System.out.println("hi");
}
}
