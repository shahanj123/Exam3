import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WrittenQuestions {

	public static void main(String[] args)throws IOException{
		String filename ="Questions.txt";
		
		FileWriter writer = new FileWriter(filename);
		BufferedWriter bufferedwriter = new BufferedWriter(writer);
		
		bufferedwriter.write("11. The difference between string, stringbuffer, and string builder is string is immutable"
				+ ", stringbuffer and stringbuilder is mutable. String is not used in threaded environments, stringbuffer is used in multi-threaded environments"
				+ "and string buffer is used in single threaded environments\n"
				+ "12. The difference between list and set is that list allows duplicates and set does not.\n"
				+ "13. Arrays are basic a basic function in Java and Arraylist is a collection of frameworks. Arraylist also has a set of methods "
				+ "to access elements and modify them.\n"
				+ "14. Hashset does not order the elements and Treeset orders elements in ascending order\n"
				+ "16. Comparator belongs to a java.util package and Comparable belongs to java.lang package."
				+ "Comparator sorts collection using two objects and Comparable compares 'this' to an object provieded\n");
		bufferedwriter.close();
	}

}
