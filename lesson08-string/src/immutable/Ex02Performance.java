package immutable;



public class Ex02Performance {
	private static final long N = 1000000;
	
	public static void main(String[] args) {
		// Tao N string(s) literal co gia tri giong nhau
		for (int i = 0; i <= N; i++) {
			String s1 = "hello";
			String s2 = "hello";
		}
		
		// Tao N string(s) object
		for (int i = 0; i <= N; i++) {
			String s1 = new String("hello");
			String s2 = new String("hello");
			
		}
	}

}
