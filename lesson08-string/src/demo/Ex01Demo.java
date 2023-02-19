package demo;

public class Ex01Demo {
	public static void main(String[] args) {
		String s = "hello from Da Nang";
		// Tính chiều dài của chuỗi S
		System.out.println("Chiều dài: " + s.length());

		// Nối chuỗi s1 vào chuỗi s
		String s1 = " 2023";
		s = s + s1;
		System.out.println("Nối chuỗi: " + s);

		// Lấy 1 ký tự tại vị trí index(3) trong chuỗi s
		s.charAt(3);

		// Đếm số lượng ký tự 'o' trong chuỗi s
		char letter = 'A';
		System.out.println("letter: " + (byte) letter);
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'o') {
				counter++;
			}
		}
		System.out.println("Đếm số lượng: " + counter);
	}
}
