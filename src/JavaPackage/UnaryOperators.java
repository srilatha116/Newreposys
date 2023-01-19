package JavaPackage;

public class UnaryOperators {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		System.out.println(a);
		System.out.println(++ a);//11 11
		
	System.out.println(a ++ + ++ a); // 11 12 13 13 
	System.out.println(a -- + -- a);   //13   12    11  11
	
	System.out.println(a ++);//  11 12
	
	System.out.println(a+b);
	}

}
