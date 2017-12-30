// Compare two strings using String.compareTo() method.
package string;
import java.util.Scanner;
public class StringCompare {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first string : ");
		String str1 = scanner.nextLine().trim();
		System.out.print("Enter second string : ");
		String str2 = scanner.nextLine().trim();
		if (str1.compareTo(str2) == 0) {
			System.out.println("String are equal.");
		} else {
			System.out.println("String are not equal.");
		}
		scanner.close();
	}
}

/*
 Enter first string : Hello World!
Enter second string : Hello World!
String are equal.
 */
