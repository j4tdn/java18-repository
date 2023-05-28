package view;

public class Ex03 {
	public static void main(String[] args) {
		String s1 = "Word";
		String s2 = "droW";
		String s3 = "dor";
		String s4 = "wdor";
		
		System.out.println("s1 - s2 ---> " + isReverse(s1, s2));
		System.out.println("s1 - s3 ---> " + isReverse(s1, s3));
		System.out.println("s1 - s4 ---> " + isReverse(s1, s4));
	}
	
	private static Boolean isReverse(String s1, String s2) {
		int length = s1.length();
		if(length != s2.length()) {
			return false;
		}
		for(int i = 0; i < length; i++) {
			if(s1.charAt(i) != s2.charAt(length - i - 1)) {
				return false;
			}
		}
		
		return true;
	}
}
