package excersies;
import java.util.Scanner;
public class Ex01IsMultiplesOfTwo {
	
	public static String inVal = "";
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		getInput();
		int n = Integer.parseInt(inVal);
		
		System.out.println((n%2 == 0 ? "true"
									 : "false"));

	}
	
	public static void getInput() {
		int wrongTimes = -1;
		do {
			
			wrongTimes++;
			if (wrongTimes == 5 ) {
				System.out.println("Invalid number ..> closing...");
				System.exit(0);
			}
			System.out.println(wrongTimes == 0 ? "Enter number: "
											  : "Please enter valid number(" + wrongTimes + "): ");
			inVal = sc.nextLine(); 
			if (isValidInput(inVal)) {
				System.out.println("========");
				break;
			}
		} while(true);
		
	}
	private static boolean isValidInput(String input) {
		char c;
		if (input.length() == 0) {
			return false;
		}
		for (int i = 0; i < input.length(); i++) {
			c = input.charAt(i);
			if(c < '0' || c > '9') {
				return false;
			}
		}
		return true;
	}
}
