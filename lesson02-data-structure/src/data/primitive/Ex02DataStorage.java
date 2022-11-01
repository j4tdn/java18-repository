package data.primitive;

public class Ex02DataStorage {
	public static void main(String[] args) {
		// VT = VP
		// Thứ tự thực hiện VP trước, được giá trị
		// thì gán cho VT
			int a = 24;
			int b = 42;
			System.out.println("a1: " + a);
			System.out.println("b1: " + b);
			
			// = Gán giá trị(STACK) của biến b cho biến a
			a = b;
			System.out.println("a2: " + a); // 42
			System.out.println("b2: " + b); // 42
			
			// Cần 1 chức năng thay đổi - method-name giá trị của 'a' - tham số
			// thành 1 giá trị khác
			modify(a); // a = 42
			System.out.println("a3: " + a); //42	
	}
	
	// Hàm: khai báo, thân hàm
	// int a = a; // input = 42, a =42
	// 						   = 159
	// Trong 2 scopes {} khác nhau thì có thể khai báo biến trùng tên
	// Trong 1 {} thì không thể cho 2 biến trùng tên
	// Biến toàn cục có thể trùng tên với biến cục bộ
	// Truyền tham số qua hàm --> PASS BY VALUE at STACK
	private static void modify(int input) {
		input = 159;
	}
}
