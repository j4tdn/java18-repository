package data.primitive;

public class Ex01BasicDemoExternal {
	public static void main(String[] args) {
		System.out.println("Age: " + Ex01BasicDemo.age);
		Ex01BasicDemo o1 = new Ex01BasicDemo();
		//Ex01BasicDemo: Class
		//o1: biến thuộc KDL đối tượng Ex01BasicDemo
		//new Ex01BasicDemo: giá trị (ô nhớ) mà o1 đang trỏ đến
		//Sử dụng biến static --> className.staticVariableName
		//Nói chung, muốn sử dụng biến non-static thì phải tạo object --> objectName.non-staticVariableName
		System.out.println(o1.price);
	}
}
