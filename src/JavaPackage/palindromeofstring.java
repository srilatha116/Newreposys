package JavaPackage;

import java.util.Scanner;

public class palindromeofstring
{
public static void main(String args[])
{
	System.out.println("enter a string");
Scanner s=new Scanner(System.in);
String str=s.nextLine();
String originalstring=str;

String rev="";

for(int i=str.length()-1;i>=0;i--)
{
rev=rev+str.charAt(i);
}
System.out.println(rev);

if(originalstring.equals(rev))

{
System.out.println("palindrome");
}
else
{
System.out.println("not a palindrom");
}
}
}