// Separate all tokens (words) using StringTokenizer.
package string;
import java.util.Scanner;
import java.util.StringTokenizer;
public class TokenCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String line = scanner.nextLine().trim();
		StringTokenizer tokenizer = new StringTokenizer(line, " ");
		while (tokenizer.hasMoreTokens()) {
			System.out.println("Remaining are : " + tokenizer.countTokens());
			System.out.println(tokenizer.nextToken());
		}
		scanner.close();
	}
}

/*
 Enter the string : We are $ {} 7 ? here.
Remaining are : 7
We
Remaining are : 6
are
Remaining are : 5
$
Remaining are : 4
{}
Remaining are : 3
7
Remaining are : 2
?
Remaining are : 1
here.

 * */
