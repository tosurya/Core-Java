// Check whether a given string is empty or not.
package string;

import java.util.Scanner;

public class EmptyStringCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String line = scanner.nextLine().trim();
		if (line.isEmpty()) {
			System.out.println("Entered string is empty.");
		} else {
			System.out.println("Entered string is not empty.");
		}
		scanner.close();
	}

}
