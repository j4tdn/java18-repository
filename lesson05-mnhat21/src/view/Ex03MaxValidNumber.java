package view;

public class Ex03MaxValidNumber {
	public static void main(String[] args) {
		String test = "Uyk892nn1234uxo2";
		System.out.println("Max value in string " + "'" + test + "' --> " + findMaxValidNumber(test));
	}
	
	private static Integer findMaxValidNumber(String s) {
		String[] tokens = s.split("[a-zA-Z]+");
		System.out.println(tokens.length);
		int count = 0;
		int max = Integer.MIN_VALUE;
		for(String token: tokens) {
			if(!token.isEmpty()) {
				int val = Integer.parseInt(token);
				if(val > max) {
					max = val;
				}
				count++;
			}
		}
		if(count == 0) {
			System.out.println("LOG >>> " + "'" + s + "' need at least 1 number");
			return 0;
		}
		return max;
	}
}
