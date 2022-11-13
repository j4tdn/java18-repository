package control;

import java.util.Scanner;

public class Ex02SwitchCaseDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		switch (number) {
		case 500: {
			System.out.println("Internal Error");
			break;
		}
		case 404: {
			System.out.println("Not Found");
			break;
		}
		case 400: {
			System.out.println("Bad Request");
			break;
		}
		default:
			System.out.println("Unknown Error");
			break;
		}
		sc.close();
	}
}
