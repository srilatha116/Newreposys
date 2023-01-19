package JavaPackage;

public class FirstJavaProgram {

	int b = 10; // class varaible or Global varaiable
	static int i = 2; // Static varaiable

	public static void main(String[] args) {

		System.out.println("God");
		
		Amethod();
		Bmethod();
		System.out.println("hi");
	}

	public static void Amethod() {
		
		int d=4; //local varaible
		System.out.println("Amethod");

	}

	public static void Bmethod() {
		System.out.println("Bmethod");
	}
}
