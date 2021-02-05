import java.util.ArrayList;

public class Question5 {

	public static void main(String[] args) {
		ArrayList<String> alist= new ArrayList<String>();
		alist.add("john");
		alist.add("phil");
		alist.add("bill");
		System.out.println("Before adding: " +alist);
		alist.add(3, "mike");
		System.out.println("After adding: " +alist);
		alist.remove(0);
		System.out.println("After removing: " +alist);
		
	}

}
