import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter Input");
            String s1=sc.next();
            System.out.println("Enter Integer");
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n",s1,x);
        }
        System.out.println("================================");
        sc.close();
	}

}
