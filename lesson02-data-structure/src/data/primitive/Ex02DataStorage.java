package data.primitive;

public class Ex02DataStorage {
	public static void main(String[] args) {
		// Vế trái (VT) = Vế phải (VP)
		// Thứ tự thực hiện: VP trước, được giá trị thì gán cho VT
		int a = 24;
		int b = 42;
		System.out.println("a1: " + a);
		System.out.println("b1: " + b);
		
		// = Gán giá trị (STACK) của biến b cho biến a
		a = b;
		System.out.println("a2: " + a);
		System.out.println("b2: " + b);
		
		// Cần 1 chức năng để thay đổi giá  trị của a thành 1 giá trị khác
		// thay đổi -> method-name
		modify(a); // a = 42
		System.out.println("a3: " + a);
		
	}
	
	// Hàm/Phương thức: Khai báo + Thân hàm
	// int input = a; // input = 42, a = 42
	//						   = 159	
	// Trong 2 scope {} khác nhau thì có thể khai báo biến trùng tên
	// Trong 1 scope {} thì không thể cho 2 biến trùng tên
	// Biến toàn cục có thể trùng tên với biến cục bộ
	// Truyền tham số qua hàm --> PASS BY VALUE AT STACK
	private static void modify(int input) {
		input = 159;
	}

}
