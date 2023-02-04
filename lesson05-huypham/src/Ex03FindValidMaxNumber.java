
public class Ex03FindValidMaxNumber {
	public static void main(String[] args) {
		//12abc02muzk586cyz --> 12 02 586
		//String s = "hh12abc02muzk586cyz";
		String[] tests = {"Uy28aksjd828js", "123h23yj328io"};
		for(String test: tests) {
			System.out.println("Max " + findValidMaxNumber(test));
		}
		
	}
	private static int findValidMaxNumber(String s) {
		String[] tokens = s.split("[a-zA-Z]+");
		int max = Integer.MIN_VALUE;
		for (String token: tokens) {
			if(!token.isEmpty()) {
				Integer validNumber = Integer.parseInt(token);
				if (validNumber > max) {
					max = validNumber;
				}
			}
		}
		return max;
	}
}
