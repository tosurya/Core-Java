// Convert any type of value to string value using String.valueOf() method.
package string;
public class ConvertIntoString {
	public static void main(String[] args) {
		int intVal = 120;
		float floatVal = 12.34f;
		double doubleVal = 2345.0d;
		boolean booleanVal = true;

		System.out.println("After converting into string");

		// printing values in string format
		System.out.println("String value of intVal: " + String.valueOf(intVal));
		System.out.println("String value of floatVal: "
				+ String.valueOf(floatVal));
		System.out.println("String value of doubleVal: "
				+ String.valueOf(doubleVal));
		System.out.println("String value of booleanVal: "
				+ String.valueOf(booleanVal));
	}
}

/*
 After converting into string
String value of intVal: 120
String value of floatVal: 12.34
String value of doubleVal: 2345.0
String value of booleanVal: true
 */
