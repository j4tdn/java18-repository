package data.primitive;

public class Ex01BasicDemoExternal {
	public static void main(String[] args) {
		// Truy cập được đến 'public' ( thuộc tính, phương thức ) Ex01BasicDemo
		// public static
		System.out.println("Price: ");
		System.out.println(Ex01BasicDemo.price);
		System.out.println("Price: " + Ex01BasicDemo.price);

		// Ex01BasicDemo: Class
		// o1: biến thuộc KDL đối tượng Ex01BasicDemo
		// new Ex01BasicDemo(); giá trị ( ô nhớ ) mà o1 đang trỏ đến
		// public non-static
		Ex01BasicDemo o1 = new Ex01BasicDemo();
		System.out.println(o1.letter);

	}
}
