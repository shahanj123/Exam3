import java.util.ArrayList;

public class Question4 {
	public static void main(String[] args) {
	ArrayList<String> alist= new ArrayList<String>();
	alist.add("john");
	alist.add("phil");
	alist.add("bill");
	System.out.println("Before " +alist);
	alist.add(3, "mike");
	
	
	System.out.println("After " +alist);
}
}


