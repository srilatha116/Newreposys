/**
 * @author Srilatha
 */
package JavaPackage;


public class Repeatedletter
{
public static void main(String args[])
{
String str="srilatha";
System.out.println(str);
 char [] cha=str.toCharArray();
for(int i=0;i<str.length();i++)
{
for(int j=i+1;j<str.length();j++)
{
if(cha[i]==cha[j])
{
System.out.println(cha[j]);
}
}
}
}
}