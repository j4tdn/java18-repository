package data.primitive;

public class Ex02DataStorage {
	public static void main(String[] args) {
		// vế trái = vế phải, thì thứ tự sẽ thực hiện VP trước, được giá trị thì gán cho VT
		int a = 24;
		int b = 42;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		// = Gán giá trị (STACK) của biến b cho biến a
		a = b;
		System.out.println("a2: " + a); //42
		System.out.println("b2: " + b); //42
		
		
		// cần 1 chức năng thay đổi (method name) giá trị của a(tham so) thành 1 giá trị khác
		modify(a); //a=42
		System.out.println("a3: " + a);
	}
	// Hàm: khai bao, thân hàm
	// int input = a; //input = 42, a =42
	//						= 159	
	// trong 2 scope {} khác nhau thì có thể khai biến trung tên
	// trong 1 scope {} thì không thể cho 2 biến trung tên
	// biến toàn cục có thể trùng tên với biến cục bộ P
	// truyên tham số qua hàm --> PASS by value at stack
	private static void modify(int input) {
		input = 159;
		
	}
}
