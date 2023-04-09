package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02HappyNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer number =  Integer.parseInt(in.nextLine());
		if(isHappyNumber(number)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println(isHappyNumber(4));
		
	}
	
	public static boolean isHappyNumber(Integer number) {
		
		List<Integer> multiResult = new ArrayList<Integer>();
		int multiNumbers = multi(number);
		System.out.println(multiNumbers);
		while (true) {
			if(multiNumbers == 1) {
				return true;
			}
			if(multiResult.contains(multiNumbers)){
				break;
			}
			multiNumbers = multi(multiNumbers);
			multiResult.add(multiNumbers);
			
		}
		return false;
	}
	
	public static int multi(int number) {
		int result = 0;
		while(number > 0) {
			int a = number % 10;
			result += a*a;
			number /= 10;
		}
		return result;
	}

}
