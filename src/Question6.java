import java.util.ArrayList;
import java.util.LinkedList;

public class Question6 {

	public static void main(String[] args) {
		LinkedList<String> LL= new LinkedList<String>();
		LL.add("Apple");
		LL.add("Orange");
		LL.add("Water");
		LL.add("Tree");
		LL.add("Leaf");
		LL.add("Beer");
		System.out.println("LinkedList " +LL);
		ArrayList<String> alist = new ArrayList<String>(LL);
		
		System.out.println("Arraylist " +alist);
	
	}

}
