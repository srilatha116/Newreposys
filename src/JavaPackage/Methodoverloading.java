/**
 * @author Srilatha
 */
package JavaPackage;

/**
 * @author srilata
 *
 */
public class Methodoverloading {

	
int a=10;//instance varaibale 
int b=20;//instance varaibale 

public void add()//Non-static method
{
	int c=a+b;
	
	System.out.println(c);
}

public void add(int c)//Non-static method
{
int d=a+b+c;

	System.out.println(d);
}




public static void main(String[] args) {
		
Methodoverloading ML=new Methodoverloading();//creating object to call the non-static method 
ML.add();//calling a method
ML.add(6);
	}

}
