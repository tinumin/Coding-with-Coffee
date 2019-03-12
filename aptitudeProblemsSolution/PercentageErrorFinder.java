/*
Question: A student multiplied a number by errnumber1/errnumber2(eg. 3/5) instead of Correctnumber1/Correctnumber2(eg. 5/3)
What is the percentage error in the calculation?
*/
package aptitudeProblemsSolution;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * @author tinumin
 *
 */


public class PercentageErrorFinder {

	public static void main(String[] args) {
		double assumeNumber = 10;
		
		Scanner obj = new Scanner(System.in);
		double err1 = obj.nextDouble();
		double err2 = obj.nextDouble();
		double crt1 = obj.nextDouble();
		double crt2 = obj.nextDouble();
		// find the error
		double error = (err1/err2)*assumeNumber;
		//find the correct
		double correct = (crt1/crt2)*assumeNumber;
		// find difference
		double difference = correct - error;
		// find error percentage
		double errPercentage =((difference/correct) * 100);
		DecimalFormat df = new DecimalFormat("#.##");      
		errPercentage = Double.valueOf(df.format(errPercentage));
		System.out.println(errPercentage+"%");

		/*errPercentage = Math.round(errPercentage);
		System.out.println(errPercentage+"%");*/

	}

}
