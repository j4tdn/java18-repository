package demo;

public class Ex04BasicMethodDemo {
	private static Ex04BasicMethodDemo o1;
	private static Ex04BasicMethodDemo o2;
	private int p1;
	private int p2;

	public Ex04BasicMethodDemo() {

	}

	public Ex04BasicMethodDemo(int p1, int p2) {
		this.p1 = p2;
		this.p2 = p2;
	}

	public static void main(String[] args) {
		int s1 = Ex04BasicMethodDemo.sum(5, 10);
		System.out.println("s1 --> " + s1);

		Ex04BasicMethodDemo c1 = new Ex04BasicMethodDemo(2, 1);
		Ex04BasicMethodDemo c2 = new Ex04BasicMethodDemo(3, 1);

		int r1 = o1.sub();
		int r2 = o2.sub();
		System.out.println("rd --> " + r1);
		System.out.println("rd --> " + r2);
	}
	// static
	// class..
	// khi 1 hàm --> ko phụ thuộc vào đối tượng đang gọi --> static

	private static int sum(int a, int b) {
		return a + b;
	}

	// non-static
	// object..
	// o1(2, 1).sub
	// o2(3, 1).sub
	// khi 1 hàm --> phụ thuộc vào đối tượng đan gọi --> static
	private int sub() {
		return this.p1 - this.p2;
	}
}
