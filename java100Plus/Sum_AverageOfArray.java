// Inserting values from user, display array, print sum and average.

package CodingEveryDay;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_AverageOfArray {

	public static void main(String[] args) {
		System.out.println("Enter your array elements limit");
		Scanner obj = new Scanner(System.in);
		int limit = obj.nextInt();
		int arr[] = new int[limit];
		int sum=0;
		System.out.println("Now enter your "+limit+ " elements");
		for(int i = 0; i < limit; i++) {
			arr[i] = obj.nextInt();
			sum +=arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("The sum is: " +sum);
		double avg = (double)sum/limit;
		System.out.println("The average is: "+avg);

	}

}
