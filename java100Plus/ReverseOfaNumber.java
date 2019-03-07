package java100Plus;

import java.util.Scanner;

public class ReverseOfaNumber {

	
	public static void main(String[] args) {
		// Local variable MUST be initialize value before the first use.
		int reverse = 0;
		int reminder = 0;
		int temp_var = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		temp_var = number;
		
		while(number != 0) {
			reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		
		// Palindrome Checking
		
		if( temp_var == reverse) {
			System.out.println("The input was :"+temp_var+" and "+"output is: "+reverse);
			System.out.println("So this is a Palindrome number.");
		}
		else {
			System.out.println("The input was :"+temp_var+" and "+"output is: "+reverse);
			System.out.println("So this not a Palindrome number.");
		}
		
		
	}

}
