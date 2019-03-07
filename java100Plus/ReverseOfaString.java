package java100Plus;

import java.util.Scanner;

public class ReverseOfaString {

	public static void main(String[] args) {
		String rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String: ");
		String string = sc.nextLine();
		int len = string.length();
		for(int i=len-1;i>=0;i--)
		{
			rev = rev+string.charAt(i);
		}
		
		System.out.println(string+ " ---> "+rev);

	}

}
