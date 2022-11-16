package demo;

public class Ex04BasicMethodStaticDemo {
	private int p1;
	private int p2;


	public Ex04BasicMethodStaticDemo() {

	}

	public Ex04BasicMethodStaticDemo(int p1, int p2) {
		this.p1 = p1;
		this.p2 = p2;

	}
	public static void main(String[] args) {
		int s1 = Ex04BasicMethodStaticDemo.sum(5, 10);
		System.out.println(s1);
		Ex04BasicMethodStaticDemo o1 = new Ex04BasicMethodStaticDemo(2, 1);
		Ex04BasicMethodStaticDemo o2 = new Ex04BasicMethodStaticDemo(3, 1);
		int r1 = o1.sub();
		int r2 = o2.sub();
		System.out.println(r1);
		System.out.println(r2);
	}

//	khi 1 ham khong phu thuoc vao doi tuong dang goi ->static
	private static int sum(int a, int b) {
		return a + b;
	}

//	non-static
//	object
//	khi 1 ham phu thuoc vao doi tuong dang goi -> non-static
//
	private int sub() {
		return this.p1 - this.p2;
	}

}
