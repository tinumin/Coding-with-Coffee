/* if you give input as '10' then program print its multiplication table like below upto 10.
10 x 1 = 10
10 x 2 = 20
10 x 3 = 30
10 x 4 = 40
10 x 5 = 50
10 x 6 = 60
10 x 7 = 70
10 x 8 = 80
10 x 9 = 90
10 x 10 = 100
*/
package CodingEveryDay;

import java.util.Scanner;

public class MultiplicationSolution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for(int i = 1; i <= 10; i++){
        	int V = N *i;
            System.out.printf("%d x %d = %d%n", N, i, V);
        }
    }
}