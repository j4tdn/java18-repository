package exercises;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Input your name : ");
		String input = ip.nextLine();
		System.out.println(capitalizeName(input));
	}
	
	private static String capitalizeName(String ip) {
		String result = "";
		String[] strings = new String[count(ip)];
		int count = 0;
		String temp = "";
		for (int i = 0; i < ip.length(); i++) {
			if(ip.charAt(i) != ' ') {
				temp += ip.charAt(i);
			}
			if(ip.charAt(i) == ' ' || i == ip.length() - 1) {
				strings[count++] = temp;
				temp = "";
				continue;
			}
		}

		for(int i = 0; i < strings.length; i++) {
			Character c = strings[i].charAt(0);
			strings[i] = strings[i].substring(1);
			strings[i] = String.valueOf(c).toUpperCase() + strings[i];
			if(i != strings.length - 1) {
				result += strings[i] + " ";
			}
		}
		return result;
	}
	
	private static int count(String s) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				count++;
			}
		}
		return count + 1;
	}
}
