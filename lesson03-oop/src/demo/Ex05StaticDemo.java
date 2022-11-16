package demo;

public class Ex05StaticDemo {
	public static void main(String[] args) {
		Ex05StaticDemo.f1();
		Ex05StaticDemo e1 = new Ex05StaticDemo();
		e1.f4();

	}

	private static void f1() {
//		f2();
	}

	private void f2() {
		f1();
	}

	private static void f3() {
//		f3();
	}

	private void f4() {
		f2();

	}

}
