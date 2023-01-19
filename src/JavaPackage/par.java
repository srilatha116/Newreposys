/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class par 
{

	public static void main(String[] args) {
		String str="SADFXGTRHCYUGIKJHGFBVSXszdrxtcfgyujkjhmngbfvdcsx";
		int up=0;
		int lo=0;
		/*
		 * String upper=""; String lower="";
		 */
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>=65 && ch<=95)
			{
				up++;
				
			}
			else
			{
				lo++;
			}
		}
		System.out.println("Total string length "+str.length());
System.out.println("Upper letters -> "+up);
System.out.println("Lower letters are -> "+lo);
		}
	}

