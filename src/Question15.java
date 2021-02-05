import java.util.ArrayDeque;
import java.util.Deque;

public class Question15 {

	public static void main(String[] args) {
		Deque<String> li = new ArrayDeque<String>();
		li.add("Mike");
		li.add("Hank");
		li.add("Mia");
		System.out.println("Before " +li);
		
		li.addFirst("First");
		li.addLast("Last");
		System.out.println("After " +li);
	}

}
