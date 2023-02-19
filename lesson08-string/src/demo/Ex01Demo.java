package demo;

public class Ex01Demo {
	public static void main(String[] args) {
		String s = "hello from DN ";
		
		System.out.println("CHiều dài chuỗi: " + s.length());
		
		String s1 = "2023";
		s = s + s1;
		System.out.println("Nối chuỗi: " + s);
		
		s.charAt(3);
		
		//Đếm số lượng trong chuỗi
		char letter = 'A';
		int counter = 0;
		for (int  i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'o') {
				counter++;
			}
		}
		System.out.println("Đếm số lượng: " + counter);
		
		
		//Duyệt/in ra/ đếm số lượng phần tử trong chuỗi 
		counter = 0;
		System.out.println("||" + s.strip() + "||");
		System.out.println("||" + s.trim() + "||");
		s = s.strip();
		
		
	}
}
