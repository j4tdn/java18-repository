package immutable;

public class Ex02Performance {
	
	private static final long N = 1000000;
	
	public static void main(String[] args) {
		//Tạo N string(s) literal có giá trị giống nhau
		for(int i = 0; i < N; i++) {
			String s1 = "hello";
			String s2 = "hello";
		}
		
		//Tao N string(s) object có giá trị giống nhau
		for(int i = 0; i < N; i++) {
			String s1 = new String("hello");
			String s2 = new String("hello");
		}
		
		//So sánh / in ra thời gia tạo
	}

}
