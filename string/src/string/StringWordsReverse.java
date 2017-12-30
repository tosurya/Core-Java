// Reverse words of a string.
package string;
import java.util.Scanner;
public class StringWordsReverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String line = scanner.nextLine().trim();
		String[] words = line.split(" ");
		String reverse = "";
		for (String word : words) {
			reverse = word +" "+ reverse;
		}
		System.out.println("Reversed string by word is : "+reverse);
		scanner.close();
	}

}

/*
 Output:
 Enter first string : How are you
 Reversed string by word is : you are How 
 */
