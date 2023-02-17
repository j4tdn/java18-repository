package immutable;
public class Ex02Performance {
	private static final long N = 1000000;
	public static void main(String[] args) {
		//Tạo N string(s) literal có giá trị giống nhau
		long start1 = System.currentTimeMillis();
		for(int i = 0;i<N;i++) {
			String s1 = "hello"; //stack -->2
			String s2 = "hello"; //heap --> 2
		}
		System.out.println("duration: "+(System.currentTimeMillis()-start1));
		//Tạo N string(s) object có giá trị giống nhau
		long start2 = System.currentTimeMillis();
		for(int i = 0;i<N;i++) {
			String s1 = new String("hello"); //stack --> 2
			String s2 = new String("hello"); //heap --> 2 triệu
		}
		System.out.println("duration: "+(System.currentTimeMillis()-start2));
	}
}
