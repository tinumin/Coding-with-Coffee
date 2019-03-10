import java.util.Scanner;

public class SubStringIndex {

	public static void main(String[] args) {
			System.out.println("Enter your String");
		        Scanner in = new Scanner(System.in);
		        // String S = in.nextLine();
		        String S = in.next();
		        System.out.println("Start from..");
		        int start = in.nextInt();
		        System.out.println("End from..");
		        int end = in.nextInt();
		        System.out.println(S.substring(start, end));
		        in.close();

	}
}
