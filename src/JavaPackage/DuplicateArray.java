/**
 * @author Srilatha
 */
package JavaPackage;

public class DuplicateArray {

	public static void main(String[] args) {
	String str[]= {"bcb","bcb","aca","ede"};
	
	boolean flag=false;
	
	for(int i=0;i<str.length;i++)
	{
		for(int j=i+1;j<str.length;j++)
			if(str[i]==str[j])
			{
				System.out.println("Duplicate element  " +str[i]);
				flag=true;
			}
	}
	
	if(flag==false)
	{
		System.out.println("no duplicate element");
	}
	}

}
