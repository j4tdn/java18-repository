package data.primitive;

// Class(Ex01BasicDemo(age, price, avg, letter)): KDL đối tượng ~ Interger ~ int
// int a = 5; int b = 10;
// Ex01BasicDemo o1 = ... = new Ex01BasicDemo(...,...,...,);  Ex01BasicDemo o2 = ...
// Ex01BasicDemo --> class
// o1,o2 --> objects được tạo ra từ class Exo1BasicDemo

public class Ex01BasicDemo {
	// access modifier
	// private: được sử dụng trong class hiện tại
	// public: sử dụng trong class hiện tại và ở ngoài class hiện tại
	
	// TODO: lesson03-oop
	// static: thuộc phạm vi của class
	//		 : tất cả các đối tượng được tạo ra từ class này 
	//		 : sẽ có chung một giá trị của biến/thuộc tính static
	// code  : để gọi biến/thuộc tính static --> ClassName.staticVariableName;
	//										 --> Nếu trong class hiện tại --> staticVariableName
	// non-static: thuộc phạm vi của từng đối tượng
	// 			 : mỗi đối tượng sẽ lưu trữ/mang một giá trị riêng
	// code 	 : để gọi biến/thuộc tính non-static --> ObjectName.nonSaticVariableName
	
	// dữ liệu
	// biến toàn cục(thuộc tính)
	
	private static int age = 20;
	public static double price = 20.6d;
	private static float avg = 20.6f;
	public char letter = 'A';
	 
	
	// chức năng
	// cú pháp: [acess modifier] [static] return_datatype method_name(data_type param1, data_type param2,...)
	public static void main(String[] args) {
		// dữ liệu
		// biến cục bộ(thuộc tính)
		// cú pháp: [final} datatupe varianlename
		
		// BLOCK SCOPE {}
		/*private static*/ int total = 222;
		
		// Vì sao thuộc tính thì có thể khai báo [private] [static]
		// nhưng biến cục bộ thì không
		
		// Trả lời: Biến cục bộ chỉ dùng trong block code hiện tại
		// Gọi trực tiếp --> Không cần lấy class chấm --> không cần static
		// Không được dùng bên ngoài scope/method/class --> không cần access modifier
		
		Ex01BasicDemo.age = 30;
		
		double price = 99.99d;
		System.out.println("local price:" + price);
		System.out.println("global price: " + Ex01BasicDemo.price);
	}
	
	public static void demo() {
		age = 60;
		// total = 22;
		
	}
}
