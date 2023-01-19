package JavaPackage;

public class StringComparison {


		public static void main(String args[])
		{
	
			String s1="abc";
			String s2="ABC";
		
		boolean b=s1.contentEquals(s2);
		System.out.println(b);
		if(s1==s2)
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("both are not requal");
		}
		}


}