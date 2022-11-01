package data.primitive;

public class Ex01BasicDemoExternal {
	public static void main(String[] args) {
		System.out.println("price: ");
		System.out.println(Ex01BasicDemo.price);
		System.out.println("price: " + Ex01BasicDemo.price);
		
		Ex01BasicDemo o1 = new Ex01BasicDemo();
		System.out.println(o1.letter);
	}

}
