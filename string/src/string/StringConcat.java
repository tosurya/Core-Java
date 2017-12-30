// concatenate two strings.
package string;
import java.util.Scanner;
public class StringConcat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String firstString = scanner.nextLine().trim();
		System.out.print("Enter second string: ");
		String secondString = scanner.nextLine().trim();
		System.out.println("String After Concatenation :"
				+ firstString.concat(secondString));
		scanner.close();
	}

}

/*
Enter first string: good
Enter second string: boy
String After Concatenation :goodboy
*/