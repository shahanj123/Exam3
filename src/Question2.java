import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Question2 {
	
	static Map <Integer, String> map= new HashMap<Integer, String>();
	
	public static void Question2() {
		ArrayList<Integer> keys= new ArrayList<Integer>(map.keySet());
		Collections.sort(keys);
		
		for (int i : keys) {
			System.out.println("Key is " + i + " and Value is " + map.get(i));
		}
		
	}

	public static void main(String[] args) {
		map.put(2, "Iron");
		map.put(5, "Coal");
		map.put(100, "Bite");
		map.put(6, "Hill");
		map.put(55, "Dill");
		map.put(21, "Gold");
		
		Question2();



	}

}
