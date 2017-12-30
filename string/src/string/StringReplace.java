// Replace string with another string in java using String.replace() method.
package string;
import java.util.Scanner;
public class StringReplace {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = scanner.nextLine().trim();
		System.out.print("Enter old string : ");
		String oldString = scanner.next();
		System.out.print("Enter new string : ");
		String newString = scanner.next();
		System.out.println("Strings after replacing : " + str.replaceAll(oldString, newString));
		scanner.close();
	}
}

/*
 Enter a string : how are you.
Enter old string : are
Enter new string : r
Strings after replacing : how r you.
 */
