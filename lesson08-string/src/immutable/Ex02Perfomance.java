package immutable;

public class Ex02Perfomance {
	private static final long N = 1000000; //1m
	public static void main(String[] args) {
		//Tạo n string(s) literal có giá trị giống nhau
		long start = System.currentTimeMillis();
		for (int i = 0; i < N; i++) {
			String s1 = "hello";
			String s2 = "hello";
		}
		System.out.println("Duration literal: " + (System.currentTimeMillis() - start) + "ms");
		
		start = System.currentTimeMillis();
		for (int i = 0; i < N; i++) {
			String s1 = new String("hello");
			String s2 = new String("hello");;
		}
		System.out.println("Duration object: " + (System.currentTimeMillis() - start) + "ms");
		
		
		//Tạo n string(s) object
		
		//So sánh / in ra thời gian tạo
	}

}
