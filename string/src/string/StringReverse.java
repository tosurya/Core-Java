// String reverse.
package string;
import java.util.Scanner;
public class StringReverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = scanner.nextLine().trim();
		char[] ch = str.toCharArray();
		String reverse = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			reverse = reverse + ch[i];
		}
		System.out.println("Reverse String is : " + reverse);
		scanner.close();
	}
}
/*
 Enter a string : Hello World!
Reverse String is : !dlroW olleH
 */
