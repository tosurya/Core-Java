// Number of characters in a string.
package string;
import java.util.Scanner;
public class StringLength {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = scanner.nextLine().trim();
		System.out.println("Number of characters in the string is : " + str.length());
		scanner.close();
	}
}

/*
Enter a string : abc
Number of characters in the string is : 3
 */
