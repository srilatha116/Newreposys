/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class Breakstatement {
public static void main(String[] args) {
	
	
	//if the conidtion is true then the access will come into the loop body
	for(int i=0;i<10;i++)
	{
		if(i==5)
		{
			//if condition is true then only ill go to inside the if loop 
			break;
		}
		
		System.out.println(i);
	}
	//once condition 
	System.out.println("Out of the loop");
}
}
