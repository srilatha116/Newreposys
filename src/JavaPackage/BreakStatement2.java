/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class BreakStatement2 {
	public static void main(String[] args) {
		
		
		//outer loop
for (int i=1;i<3;i++) 
{
for(int j=1;j<3;j++)
{
	if(i==3 && j==3)
	{
		break;
	}

			
	
System.out.println(i+"  "+j);
}
System.out.println("out of the loop");
}
}
}
