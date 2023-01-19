package JavaPackage;

public class ReverseofString {
	
public static void main(String[] args) 

{
String str="srilathakris";
/*
 * String rev="";
 * 
 * for (int i=str.length()-1;i>=0;i--)
 *  { 
 *  rev=rev+str.charAt(i);
 * 
 * } System.out.println(rev);
 */

StringBuilder str2=new StringBuilder();
str2.append(str);
System.out.println(str2);
str2.reverse();
System.out.println(str);
}

}