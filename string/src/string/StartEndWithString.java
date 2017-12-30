// String.startsWith() and String.endsWith()
package string;
import java.util.Scanner;
public class StartEndWithString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = scanner.nextLine().trim();
		System.out.print("Enter prefix : ");
		String prefix = scanner.next();
		System.out.print("Enter suffix : ");
		String suffix = scanner.next();
		if (str.startsWith(prefix) && str.endsWith(suffix)) {
			System.out.println(str + " prefix is " + prefix + " and suffix is " + suffix);
		} else {
			System.out.println("Please enter correct prefix and suffix");
		}
		scanner.close();
	}
}

/*
 Enter a string : www.includehelp.com
Enter prefix : www
Enter suffix : com
www.includehelp.com prefix is www and suffix is com
 */
