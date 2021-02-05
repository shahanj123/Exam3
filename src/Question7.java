import java.util.Arrays;
import java.util.HashSet;

public class Question7 {

	public static void main(String[] args) {
		HashSet <String> hs= new HashSet<>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		System.out.println("Hashlist is: "+ hs);
		Object[] ar = hs.toArray();
		System.out.println("Array is: "+ Arrays.toString(ar));
	}

}
