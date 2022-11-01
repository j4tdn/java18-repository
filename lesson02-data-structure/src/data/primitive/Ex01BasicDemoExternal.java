package data.primitive;

public class Ex01BasicDemoExternal {

	public static void main(String[] args) {
		// truy cap duoc den 'public' (thuoc tinh, phuong thuc) WEx01BasicDemo
		System.out.println("price: ");
		System.out.println(Ex01BasicDemo.price);
		System.out.println("price: " + Ex01BasicDemo.price);
		
		
		// Ex01BasicDemo: Class
		//o1: bien thuoc KDL doi tuong Ex01Basicemo
		//new Ex01BasicDemo(); gia tri(o nho) ma o1 dang tro den
		Ex01BasicDemo o1 = new Ex01BasicDemo();
		System.out.println(o1.letter);

	}

}
