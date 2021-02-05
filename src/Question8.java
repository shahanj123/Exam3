import java.util.ArrayList;
import java.util.Collections;

public class Question8 {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Mike");
		alist.add("Steve");
		alist.add("Bill");
		alist.add("Adam");
		alist.add("Hank");
		
		System.out.println("List in order: " +alist);
		
		Collections.reverse(alist);
		System.out.println("List in reverse "+ alist);

	}

}
