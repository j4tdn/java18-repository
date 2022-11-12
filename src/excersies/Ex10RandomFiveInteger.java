package excersies;

import java.util.Random;

public class Ex10RandomFiveInteger {
	
	public static Random rd = new Random();
	public static String logs = "";
	
	public static void main(String[] args) {
		int rdValue;
		System.out.print("--> ");
		for (int i = 0; i < 5; i++) {
			rdValue = getRandom();
			while (isInLogs(rdValue)) {
				rdValue = getRandom();
			}
			System.out.print(rdValue + "|");
		}		
	}
	public static int getRandom() {
		int output = 0;
		output = 20 + rd.nextInt(11);
		logs += output + ";";
		return output;
			
	}
	public static boolean isInLogs(int val) {
		int ct = 0;
		String temp = "";
		for (int i = 0; i < logs.length(); i++) {
			if (logs.charAt(i) != ';') {
				temp += logs.charAt(i);
			}
			else if (logs.charAt(i) == ';') {
				if (val == Integer.parseInt(temp)) {
					temp = "";
					ct++;
				}
				else {
					temp = "";
					continue;
				}
			}
		}
		if (ct == 1) {
			return false;
		} else {
		return true;
		}
	}
}
