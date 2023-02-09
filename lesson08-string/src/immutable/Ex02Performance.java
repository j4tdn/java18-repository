package immutable;

public class Ex02Performance {
	
	private static final long N = 1000000;
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		// Tạo N string(s) literal có giá trị giống nhau
		for(int i = 0; i < N; i++) {
			String s1 = "hello";
			String s2 = "hello";
		}
		System.out.println("duration literal --> " + (System.currentTimeMillis() - start));
		
		start = System.currentTimeMillis();
		// Tạo N string(s) object có giá trị giống nhau
		for(int i = 0; i < N; i++) {
			String s1 = new String("hello");
			String s2 = new String("hello");
		}
		System.out.println("duration object --> " + (System.currentTimeMillis() - start));
	}
}
