package excersies;

import java.util.Scanner;

public class Ex05IsSymmetryNumber {
	public static String inVal = "";
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		getInput();
		System.out.println(isSymmetry(inVal));
	}
	public static boolean isSymmetry(String input) {
		
		char leftC; 
		char rightC;
		boolean done = false;
		//Lọc những số 0 ở đầu tiên ra khỏi String Input
		
		String Input = String.valueOf(Integer.parseInt(input));
				
		int loI = Input.length();
		//Loại bỏ những số 0 nằm đầu tiên của dãy số
		for (int i = 0; i < loI; i++) {
			if (Input.charAt(i) == '0' && !done) {
				continue;
			}
			leftC = Input.charAt(i);
			rightC = Input.charAt((loI - 1) - i);
			if (leftC != rightC) {
				return false;
			}
		}
		return true;
	}
	public static void getInput() {
		int wrongTimes = -1;
		do {
			
			wrongTimes++;
			if (wrongTimes == 5) {
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
		if (input.length() < 2) {
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
