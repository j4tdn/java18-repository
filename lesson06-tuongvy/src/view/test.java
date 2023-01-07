// Java Program to Demonstrate Working of matches() Method
// of String class
package view;
// Main class
public class test {

	// Main driver method
	public static void main(String args[])
	{

		// Declaring and initializing a string
		// Input string
		String Str = new String("Welcome to geeksforgeeks");

		// Display message for better readability
		System.out.print(
			"Does String contains regex (.*)geeks(.*) ? : ");
		// Testing if regex is present or not
		System.out.println(Str.matches(".* .*"));

		// Display message for better readability
		System.out.print(
			"Does String contains regex geeks ? : ");

		// Testing if regex is present or not
		System.out.println(Str.matches("geeks"));
	}
}
