// Program to find last index of any character in string.
package string;
import java.util.Scanner;
public class LastIndex {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter sentence here : ");
		String line = scanner.nextLine().trim();
		System.out.print("Enter the element for last occurrence : ");
		String ch = scanner.next();
		if (line.contains(ch)) {
			System.out.println("Last index is :" + line.lastIndexOf(ch));
		} else {
			System.out
					.println("Please enter a character which is available in the sentence.");
		}
		scanner.close();
	}
}

/*
 Output:
 Enter sentence here :  Good morning
 Enter the element for last occurrence : m
 Last index is :5
 */
