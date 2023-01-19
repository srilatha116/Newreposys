package JavaPackage;

public class Variable2 {

	public static void main(String[] args) {

		String a[] = { "hai", "java" };

		String aa[] = { "asd", "wert" };

		int i[] = { 1, 2, 3, 4 };

		Object[] d = { 1, "srialtha", 'g' };

		System.out.println(a[1]);
		System.out.println(a[0]);
		System.out.println(aa[1]);
		System.out.println(i[3]);

		for (Object output : d) {
			System.out.println(output);
		}

		Object[] dd = { "hai", 2, "srilatha", 4 };
		System.out.println(dd[1]);
	}

}
