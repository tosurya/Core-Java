// Get sub string from a given string.
package string;

import java.util.Scanner;

public class SubString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String line = scanner.nextLine().trim();
		System.out.print("Enter start index: ");
		int startIndex = scanner.nextInt();
		System.out.print("Enter end index: ");
		int endtIndex = scanner.nextInt();
		System.out.println("Substring is: " + line.substring(startIndex, endtIndex));
	}

}

/*
Enter the string : www.includehelp.com
Enter start index: 2
Enter end index: 6
Substring is: w.in
*/