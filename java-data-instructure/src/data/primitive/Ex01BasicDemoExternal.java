package data.primitive;

public class Ex01BasicDemoExternal {
	
	public static void main(String[] args) {
		//Truy cập được đến 'public'(thuộc tính,phương thức)
		System.out.println("price:" + Ex01BasicDemo.price);
		// Ex01BasicDemo: class
		//o1: biến thuộc KDL đối tượng Ex01BasicDemo
		//new Ex01Basicc(); giá trị (ô nhớ)mà o1 đang trỏ đến
		Ex01BasicDemo o1= new Ex01BasicDemo();
		System.out.println(o1.letter);
	}
      
}
