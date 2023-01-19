/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class WhileLoop {

	
	public static void main(String[] args) {
		int i=1;
		
		while(i<20 & i<5)  //Bitwise operator checks for the both the conditions first and second
		{
			System.out.println(i);
			i++;//if we forget to pass --/++ then program will execute infinte 	
		}

	}

}
