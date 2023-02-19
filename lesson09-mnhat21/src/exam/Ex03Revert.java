package exam;

public class Ex03Revert {
	public static void main(String[] args) {
		String s = "Welcome  to JAVA10    class";
		s = s.replaceAll(" {1,}", " ");
		for(int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}
	
}
