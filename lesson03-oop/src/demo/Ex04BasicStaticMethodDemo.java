package demo;

public class Ex04BasicStaticMethodDemo {

	private int p1;
	private int p2;

	public Ex04BasicStaticMethodDemo() {

	}

	public Ex04BasicStaticMethodDemo(int p1, int p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public static void main(String[] args) {
		int s1 = Ex04BasicStaticMethodDemo.sum(5, 10);
		System.out.println("s1 --> " + s1);

		Ex04BasicStaticMethodDemo o1 = new Ex04BasicStaticMethodDemo(2, 1); // H1
		Ex04BasicStaticMethodDemo o2 = new Ex04BasicStaticMethodDemo(3, 1); // H2
		int r1 = o1.sub();
		int r2 = o2.sub();
		System.out.println("r1 --> " + r1);
		System.out.println("r2 --> " + r2);

	}

	// static
	// class...
	// khi 1 ham --> ko phu thuoc vao doi tuong dang goi --. static
	private static int sum(int a, int b) {
		return a + b;
	}

	// non- static
	// object..
	// o1(2, 1).sub
	// o2(3, 1).sub
	// khi 1 hafm --> phu thuoc vao doi tuong dang goi --> non static
	private int sub() {
		return this.p1 - this.p2;
	}

}
