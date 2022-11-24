package demo;

public class Ex05StaticDemo {
	/*
	 * static
	 * 	+ attribute
	 * 		.static --> tat ca cac doi tuong mang 1 gia tri chung
	 * 		.non    --> moi doi tuong mang 1 gia tri rieng 
	 * 
	 * 	+ method
	 * 		.static --> ham khong phu thuoc vao doi tuong dang goi
	 * 		.non    --> ham phu thuoc vao doi tuong dang goi
	 * 
	 * invoke
	 * 	--> attribute, method
	 * 		+ static --> lay class goi truc tiep
	 * 		+ non    --> khoi tao mot doi tuong tu class roi goi
	 */
	public static void main(String[] args) {
		Ex05StaticDemo.f1();
		Ex05StaticDemo e1 = new Ex05StaticDemo();
		e1.f4();
	}

	private static void f1() {
		//f2(); // khoi tao doi tuong hien tai moi goi duoc
	}

	private void f2() {
		f1();
	}

	private static void f3() {
		f1();
	}
	
	//e1.f4();
	private void f4() {
		f2();
	}
}
