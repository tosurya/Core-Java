// Find occurrences of each character in a string.
package string;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class CharCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = scanner.nextLine().trim();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		int count = 1;
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, count++);
			} else {
				map.put(c, count);
			}
		}
		System.out.println(map);
		scanner.close();
	}
}

/*
 Output:
 Enter a string : Save water save earth
{w=1, v=5,  =7, t=11, e=8, s=4, r=10, S=1, a=9, h=12} 
 */