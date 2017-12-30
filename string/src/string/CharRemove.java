// Remove a particular character from a string
package string;
public class CharRemove {
	public static void main(String[] args) {
		String str = "this is Java";
		System.out.println("remove 3rd char in string");
		System.out.println(str.substring(0, 3) + str.substring(4));
	}

}
