/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *a
 *a b
 *a b c
 *a b c d
 */
public class Charaterpatter
{            
    public static void main(String[] args)
    {
        int alphabet = 65;
                for (int i = 0; i <= 3; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}