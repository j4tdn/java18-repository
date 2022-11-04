package data.primitive;

public class Ex01BasicDemoExternal {
	public static void main(String[] args) {
		// Truy cap được đến 'public'(thuộc tính, phương thức) Ex01BasicDemo	
		System.out.println("price:");
		System.out.println(Ex01BasicDemo.price);
		System.out.println("price: " + Ex01BasicDemo.price);
		
		// Ex01BasicDemo: Class
		//o1: biến thuộc KDL đối tượng Ex01BasicDemo
		//new Ex01BasicDemo(): giá trị (ô nhớ) mà o1 đang trỏ đến.
		// public non-static
		Ex01BasicDemo o1 = new Ex01BasicDemo(); 
		System.out.println(o1.letter);
	}
}
