package control;

import java.util.Scanner;

public class Ex02SwitchCaseDemo {
	/* 
	 * 
	 * */ 
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Number: ");
		int status = ip.nextInt();
		String desc = "";
		
		switch (status) {
		case 500:
			desc = "Internal Error";
			break;
		case 404:
			desc = "Not Found";
			break;
		case 400:
			desc = "Bad Request";
			break;
		default:
			desc = "Unknown Error";
		}
		System.out.println("Switch case desc ==> " + desc);
	}
}
