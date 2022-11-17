package demo;

public class Ex04BasicStaticMethodeDemo {
	private int p1;
	private int p2;
	public Ex04BasicStaticMethodeDemo(int p1,int p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public static void main(String[] args) {
		int p1 = Ex04BasicStaticMethodeDemo.sum(5, 10);
		System.out.println(p1);
		
		Ex04BasicStaticMethodeDemo o1 = new Ex04BasicStaticMethodeDemo(2, 1);
		Ex04BasicStaticMethodeDemo o2 = new Ex04BasicStaticMethodeDemo(3, 1);
		
		int r1 = o1.sub();
		int r2 = o2.sub();
		
		System.out.println(r1);
		System.out.println(r2);
	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private int sub() {
		return this.p1 - this.p2;
	}
}
