package JavaPackage;

public class StringProgram {

	public static void main(String[] args) {
		String s="srilatha"; //Defining a variable
		String k="goutham";//Defining a variable
		String p="prassana lakshmi";//Defining a variable
		String kr="krishna";//Defining a variable
		
System.out.println("Lenght of the string  " +s.length());//Calling a variable	
System.out.println("String lenght"  +k.length());
System.out.println("String lenght of prassana "+p.length());
System.out.println("Length of the string " +kr.length());
		
//StringProgram st=new StringProgram();//Creation of a object for calling the non-static method in the static method
//st.name();
name();
	}

	
	public static void name() {
		
		int a=90;//Declaration of a variable
		int b=a;
		System.out.println(a);
	}
}
