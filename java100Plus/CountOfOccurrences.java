// ----- output ------
/*Enter your string. (eg. assassination)
assassination
Enter your char. (eg. s)
s
4
*/

package CodingEveryDay;

import java.util.Scanner;

public class CountOfOccurrences {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your string. (eg. assassination)");
	String subjectLine = scan.nextLine();
	System.out.println("Enter your char. (eg. s)");
	char ch = scan.next(".").charAt(0);
		
		System.out.println(countCharacter(subjectLine, ch));

	}
	
	public static int countCharacter(String str, char ch)
	{
		int count = 0;
		int index = 0;
		while(index < str.length())
		{
			if(str.charAt(index) == ch)
			{
				count++;
			}
			index++;
		}
		return count;
	}

}
