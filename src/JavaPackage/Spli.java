/**
 * @author Srilatha
 */
package JavaPackage;

import java.util.Iterator;

/**
 * @author srilata
 *
 */
public class Spli {
public static void main(String[] args) {
	String str="stwerwer sadf asdfg a 345";
	System.out.println(str.length());
	String afterchara=str.concat("hi");
    System.out.println(afterchara);
    char[] cha=str.toCharArray();
System.out.println(str);
    for (int i = 0; i < str.length(); i++) {
    	{
    		for (int j = i+1; j < str.length(); j++) {
    		    

				if(cha[i]==cha[j])
					
				{
					System.out.println(cha[j]);
				}
				
			}
    	}
		
	}
}
}
