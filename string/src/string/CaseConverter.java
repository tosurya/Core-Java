// Convert string to lowercase and uppercase.
package string;
import java.util.Scanner;
public class CaseConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String line = scanner.nextLine().trim();
		System.out.println("Lower Case String : "+line.toLowerCase());
		System.out.println("Upper Case String : "+line.toUpperCase());
		scanner.close();
	}
}

/*
 Enter the string : Hello Guys.
Lower Case String : hello guys.
Upper Case String : HELLO GUYS.
*/
