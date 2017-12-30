// Input a string from user and reverse each word of given string.
package string;
import java.util.Scanner;
public class ReverseEachWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String line = scanner.nextLine().trim();
		String[] words = line.split(" ");
		System.out.print("String with Reverese Word : ");
		for (String word : words) {
			char[] ch = word.toCharArray();
			for (int i = ch.length - 1; i >= 0; i--) {
				System.out.print(ch[i]);
			}
			System.out.print(" ");
		}
		scanner.close();
	}
}

/*
Enter the string : Hello Welcome in India
String with Reverese Word : olleH emocleW ni aidnI 
 */
