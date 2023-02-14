package demo;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Input N :");
			long valueN = Long.parseLong(sc.nextLine());
			System.out.println("Input N :");
			long valueM = Long.parseLong(sc.nextLine());
			try {
				if (isValidate(valueN, valueM)) {
					if(equivalentPrimes(valueN, valueM)) System.out.println("YES");
					else System.out.println("NO");
				}	
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);

	}

	private static boolean equivalentPrimes(long inputN, long inputM) {
		for(int i = 2 ; i<inputM;i++){
			if(inputM%i == 0 && inputN %i == 0) return true;
		}
		return false;
	}

	private static boolean isValidate(long inputN, long inputM) throws Exception {
		Long milestone = new Long("300000000000000000");
		if (!(2 <= inputM && inputN <= milestone && inputM <= inputN)) {
			throw new Exception("Invalid input !");
		}
		return true;
	}
}
