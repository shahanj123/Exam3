import java.util.ArrayList;
import java.util.Collections;

public class Question3 {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<>();
		alist.add(3);
		alist.add(60);
		alist.add(77);
		alist.add(32);
		alist.add(9);
		alist.add(10);
		Collections.sort(alist, Collections.reverseOrder()); 
		System.out.println(alist);
	}

}
