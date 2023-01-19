/**
 * @author Srilatha
 */
package JavaPackage;

import java.util.HashMap;

/**
 * @author srilata
 *
 */
public class Map {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "Srilatha");
		map.put(2, "Krishna");
		map.put(3, "goutham");

		map.put(4, "prassana");
		System.out.println(map);
		
		map.put(101, "sri loves krish");
		System.out.println(map.get(101));
		System.out.println(map.size());
		/*
		 * Object[] input = {"srilatha","loves","Krish",'g','p'};
		 * 
		 * for(Object output:input) { System.out.println(output); }
		 */

	}

}
