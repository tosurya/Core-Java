// Check Given String is Palindrome String or not.
package string;
import java.util.Scanner;
public class PalindromString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String line = scanner.nextLine().trim();
		String str = line;
		char[] ch = str.toCharArray();
		String palindrom = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			palindrom = palindrom + ch[i];
		}
		if (palindrom.equals(line)) {
			System.out.println(line + " is palindrom.");
		} else {
			System.out.println(line + " is not palindrom.");
		}
		scanner.close();
	}
}

/*
 Enter the string : abcba
 abcba is palindrom.
 */
