/**
 * @author Srilatha
 */

package JavaPackage;

import java.util.Arrays;

/**
 * @author srilata
 *
 */

	public class Array {
	    public static void main(String[] args) 
	    {
	     
	int a[]={1,2,3,2,3,1,5,6,2};
	int max[]=0;
	
	Arrays.sort(a);
	for(int i=0;i<a.length;i++)
	{
if(a[i]>max[a])
	System.out.println("order of an array "+a[i]);
	

	}
	    }

		
	}

