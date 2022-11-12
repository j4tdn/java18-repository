package excersies;

import java.util.Scanner;

public class Ex06GreatesNumber {
	
	public static String inVal = "";
	public static int a;
	public static int b;
	public static int c;
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter a: ");
		a = getInput();
		System.out.print("Enter b: ");
		b = getInput();
		System.out.print("Enter c: ");
		c = getInput();
		System.out.println("..>" +a + " " + b + " "+c );
		System.out.println("Greatest number is " + get(a, b, c, "Greatest"));
		System.out.println("Smallest number is " + get(a, b, c, "Smallest"));

		

	}
	public static int get(int val1, int val2, int val3, String op) {
		while (true) {
			if (val1 < val2) {
				val1 = swapValue(val1, val2, 0);
				val2 = swapValue(val1, val2, 1);
			}
			if (val2 < val3) {
				val2 = swapValue(val2, val3, 0);
				val3 = swapValue(val2, val3, 1);
			}
			if (val1 < val3) {
				val1 = swapValue(val1, val3, 0);
				val3 = swapValue(val1, val3, 1);
			}
			if (val1 >= val2 && val2 >= val3) {
				break;
			}		
		}
		if (op == "Greatest") {
			return val1;
		} else if (op == "Smallest") {
			return val3;
		}
		return 0;
		}
	public static int swapValue(int val1, int val2, int i) {
		int temp;
		temp = val1;
		val1 = val2;
		val2 = temp;
		if (i == 0) {
			return val1;
		}
		return val2;
	}
	public static int getInput() {
		int result;
		int wrongTimes = -1;
		do {	
			wrongTimes++;
			if (wrongTimes == 5) {
				System.out.println("Invalid number ..> closing...");
				System.exit(0);
			}
			System.out.println(wrongTimes == 0 ? "" :"Please enter valid number(" + wrongTimes + "): ");
			inVal = sc.nextLine(); 
			if (isValidInput(inVal)) {
				if (Integer.parseInt(inVal) >= 20) {
					System.out.println("!Given number must less than 20");
					continue;
				}
				System.out.println("========");
				break;
			}
		} while(true);
		result = Integer.parseInt(inVal);
		return result;
		
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
