// Trim a given string using String.trim() method.
package string;
import java.util.Scanner;
public class StringTrim {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string with white spaces: ");
		String line = scanner.nextLine().trim();
		System.out.println("After remove white spaces in string : "+line.trim());
		scanner.close();
	}
}

/*
Enter a string with white spaces:           abc      
After remove white spaces in string : abc
*/