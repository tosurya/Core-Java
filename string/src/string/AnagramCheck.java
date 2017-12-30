// Check given strings are Anagram or not.
// Two strings are called anagrams if they contain same set of characters but in different order.
package string;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string one : ");
		String str1 = scanner.nextLine().trim();
		System.out.print("Enter the string two : ");
		String str2 = scanner.nextLine().trim();
		if (str1.length() == str1.length()) {
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if (Arrays.equals(ch1, ch2)) {
				System.out.println(str1 + " and " + str2 + " are anagrams.");
			} else {
				System.out.println(str1 + " and " + str2 + " are not anagrams.");
			}
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
		}
		scanner.close();
	}
}

/*
Enter the string one : keep
Enter the string two : peek
keep and peek are anagrams.
*/