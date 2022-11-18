package demo;

public class Ex05StaticDemo {
	public static void main(String[] args) {
		Ex05StaticDemo.f1();
		Ex05StaticDemo e1 = new Ex05StaticDemo();
		e1.f4();
	}

	private static void f1() {
		// f2(); // khởi tạo đối tượng từ claas hiện tại mới gọi đc
	}

	private void f2() {
		f1();
	}

	private static void f3() {
		f3();
	}

	// e1.f4()
	private  void f4() {
		f2();
	}
}
