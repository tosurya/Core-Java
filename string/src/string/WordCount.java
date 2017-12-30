// Get string and count number of words in provided string.
package string;
import java.util.Scanner;
public class WordCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String line = scanner.nextLine().trim();
		String[] words = line.split(" ");
		System.out.println("No. of Words in String :" + words.length);
		scanner.close();
	}
}

/*
 Enter the string : Hello This is India
 No. of Words in String :4
 */
