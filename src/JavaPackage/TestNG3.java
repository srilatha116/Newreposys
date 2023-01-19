/**
 * @author Srilatha
 */
package JavaPackage;

import org.testng.annotations.Test;

/**
 * @author srilata
 *
 */
public class TestNG3 {
@Test(groups = "sanity",priority = -1,invocationCount = 4)
	public void testcase1()
	{
	
	String str="multiplsde";
		System.out.println("string length " +str.length());//negative priority will print first
		System.out.println("negative priority so i will execute first");
	}


@Test(groups = "sanity",priority = 1,invocationCount = 4)// priority will print fourth
public void testcase2()
{

String str="multiple";
	System.out.println("string length" +str);
	System.out.println("posotive priority so i will execute last");
	
}

@Test(groups = "sanity",priority = 0,invocationCount = 4)//ZERO priority will print third
public void testcase3()
{

String str="multiple";
	System.out.println("string length" +str);
	System.out.println(" zero priority so i will execute third");
	
}

@Test(groups = "regression",invocationCount = 4)////No priority will print second
public void testcase()
{

String str="multiple";
	System.out.println("string length" +str.length());
	System.out.println("No priority so i will execute Second");
	}
}

