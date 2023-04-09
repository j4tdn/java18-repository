package view;

import java.util.ArrayList;
import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("input : ");
		Integer input = ip.nextInt();
		ArrayList<Integer> save = new ArrayList<>();
		Integer result = 0;
		boolean check = true;
		while(check) {
			while(input != 0) {
				Integer a = input % 10;
				input = input / 10;
				result += selfPow(a, 2);
			}
			if(save.contains(result)) {
				check = false;
				break;
			}
			if(result == 1) {
				break;
			}	
			save.add(result);
			input = result;
			result = 0;
		}
		System.out.println(check);
	}
	
	private static int selfPow(int val, int n) {
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result *= val;
		}
		return result;
	}
}
