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
		
		Ex04BasicStaticMethodDemo o1 = new Ex04BasicStaticMethodDemo(2,1);
		Ex04BasicStaticMethodDemo o2 = new Ex04BasicStaticMethodDemo(3,1);
		Ex04BasicStaticMethodDemo o3 = new Ex04BasicStaticMethodDemo(4,1);

		int r1 = o1.sub();
		int r2 = o2.sub();
		int r3 = o3.sub();
		
		System.out.println("r1 --> " + r1);
		System.out.println("r2 --> " + r2);
		System.out.println("r3 --> " + r3);
	}

	// static
	// class...
	// khi 1 hàm --> ko phụ thuộc vào đối tượng đang gọi --> static
	private static int sum(int a, int b) {
		return a + b;
	}

	// non-tatic
	// object...
	// o1(2,1).sub
	// o2(3,1).sub
	// khi 1 hàm --> phụ thuộc vào đối tượng đang gọi --> non-static
	private int sub() {
		return p1 - p2;
	}
}
