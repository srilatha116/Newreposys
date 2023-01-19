/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class Stringmethods {
	
	public static void main(String[] args) {
		String str="srilatha QA as we as";
		
	String str2="12342345";
	String str4="";
	
	
	String str3=str.concat(str2);
		System.out.println("The index of the letter in the given string " +str.charAt(3));
		System.out.println(str.compareTo(str2));//comparing the string
		System.out.println(str3.contains(str3));//concatenation
		System.out.println(str.contains("QA"));//true or false
		
		System.out.println(str.endsWith(str2));//ture of false(string should be ends with)
		System.out.println(str.isBlank());//String is not blank 
		System.out.println(str4.isEmpty());//true
		System.out.println(str2.replace("",str4));//replaces the string
		System.out.println(str.strip());

		String s[]=str.split("\\s");
		for(String spil:s)
			System.out.println(spil);
		
		
	}
	
	/*
							 
*String charAt()
String compareTo()
String concat()
String contains()
String endsWith()
String equals()
equalsIgnoreCase()
String format()
String getBytes()
String getChars()
String indexOf()
String intern()
String isEmpty()
String join()
String lastIndexOf()
String length()
String replace()
String replaceAll()
String split()
String startsWith()
String substring()
String toCharArray()
String toLowerCase()S
tring toUpperCase()
String trim()
String valueOf()
							 */
}
