package view;

public class Ex03FindValidMaxNumber {
	public static void main(String[] args) {
		String[] tests = {"Uyk892nn1234uxo2", "", };
		for (String test : tests) {
			System.out.println("Max valid number in '" + test + "' --> " + findMaxValidNumber(test));
		}
	}
	
	private static int findMaxValidNumber(String s) {
		int count = 0;
		String[] tokens = s.split("[a-zA-Z]+");
		int max = Integer.MIN_VALUE;
		for (String token : tokens) {
			if (!token.isEmpty()) {
				Integer validNumber = Integer.parseInt(token);
				if (validNumber > max) {
					max = validNumber;
				}
				count++;
			}
		}
		if (count == 0) {
			System.out.println("LOG >>> "+ s + "nfjfhn");
		}
		return max;
	}

}
