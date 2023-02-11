package immutable;

public class Ex02Performance {
	
	private static final long N = 1000000; // 1 Triệu
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		//Tạo N string(s) literal giá trị giống nhau
		for ( int i = 0; i < N; i++) {
			String s1 = "hello"; //stack: 2
			String s2 = "hello"; //heap: 1
		}
		System.out.println("duration literal: " + (System.currentTimeMillis() - start) + "ms" );
		
		start = System.currentTimeMillis();
		//Tạo N string(s) object giá trị giống nhau
		for ( int i = 0; i < N; i++) {
			String s1 = new String("hello"); //stack: 2
			String s2 = new String("hello"); //heap: 2 triệu
		}
		System.out.println("duration object: " + (System.currentTimeMillis() - start) + "ms" );
	}
}
