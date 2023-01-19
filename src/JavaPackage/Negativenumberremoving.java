/**
 * @author Srilatha
 */
package JavaPackage;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author srilata
 *
 */
public class Negativenumberremoving {
	 
    // Function to remove the
    // negative elements from the array
    public static ArrayList<Integer>
    remNeg(ArrayList<Integer> arr)
    {
        arr.removeIf(n -> n < 0);
        return arr;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        ArrayList<Integer> arr
            = new ArrayList<Integer>(
                Arrays.asList(1, -3, 2,-4,7));
 
        arr = remNeg(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}