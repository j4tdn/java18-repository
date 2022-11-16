package demo;

public class Ex05StaticDemo {
	/*
	 * static
	 * 	 + attribute
	 *     . static --> tất cả các đối tượng mang một giá trị chung
	 *     . non    --> mỗi đối tượng mang một giá trị riêng
	 * 
	 *   + method
	 *     . static --> hàm không phụ thuộc vào đối tượng đang gọi
	 *     . non    --> hàm phụ thuộc vào đối tượng đang gọi
	 *     
	 *  invoke
	 *   --> attribute, method
	 *       + static --> lấy class gọi trực tiếp
	 *       + non    --> khởi tạo một đối tượng từ class rồi gọi    
	 */
	public static void main(String[] args) {
		Ex05StaticDemo.f1();
		Ex05StaticDemo e1 = new Ex05StaticDemo();
		e1.f4();
		
	}
	
	private static void f1() {
		// f2(); // khởi tạo đối tượng từ class hiện tại mới gọi dc
	}

	private void f2() {
		f1();
	}

	private static void f3() {
		f3();
	}

	// e1.f4()
	private void f4() {
		f2();
	}
}
