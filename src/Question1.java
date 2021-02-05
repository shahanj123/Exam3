import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Question1 {

	public static void main(String[] args) {
		Map<Integer, String> hashmap= new HashMap<Integer, String>();
		hashmap.put(1, "Shahan");
		hashmap.put(2, "George");
		hashmap.put(3, "Mike");
		
		Iterator<Entry<Integer, String>> it=hashmap.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<Integer, String> set = (Map.Entry<Integer, String>) it.next();
			System.out.println(set.getKey()+ " is " + set.getValue());
		}
		
	} 

}
