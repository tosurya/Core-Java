// Program to make first alphabet capital of each word in given string.
package string;
import java.util.Scanner;
public class CapitalWord {
	public static void main(String[] args) {
		String upper_case_line = "";
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter sentence here : ");
		String line = scanner.nextLine().trim();
		String[] words = line.split(" ");
		for (String word : words) {
			upper_case_line += Character.toUpperCase(word.charAt(0))
					+ word.substring(1) + " ";
		}
		System.out.println("Sentence after convert : " + upper_case_line);
		scanner.close();
	}
}

/*
Output:
Enter sentence here : we are looking for good writers.
Sentence after convert :We Are Looking For Good Writers. 
*/
