package data.primitive;

// Class: thuộc KDL đối tượng ~ Integer 
// Ex01BasicDemo(age, price, avg, letter)
// Ex01BasicDemo o1 = new Ex01BasicDemo(.., .., .., ..)
// Ex01BasicDemo o2 = new Ex01BasicDemo(.., .., .., ..)
// ==> o1, o2: object

public class Ex01BasicDemo {
	// private: Sử dụng trong Class hiện tại
	// public: Sử dụng trong Class hiện tại và ở ngoài Class hiện tại
	
	// TODO: lesson03-OOP
	// static: một cái biến mà thêm "static" => biến đó thuộc phạm vi của class
	//	     : => Tất cả các đối tượng được tạo ra từ class này sẽ có chung 1 giá trị của biến/thuộc tính static
	// Code  : để gọi biến/thuộc tính static --> ClassName.staticVariableName;
	//										 --> Nếu trong class hiện tại --> staticVariableName
	
	// non-static: thuộc phạm vi của từng đối tượng
	// 			 : mỗi đối tượng sẽ lưu trữ và mang một giá trị riêng
	// Code		 : để gọi biến/thuộc tính non-static --> ObjectName.nonStaticVariableName
	
	// data
	// biến toàn cục (thuộc tính)
	// Cú pháp: [access modifier] [static] [final] datatype variablename
	private static int age = 20;
	public static double price = 20.6d;
	private static float avg = 20.6f;
	public char letter = 'A';

	// function
	// Cú pháp: [access modifier] [static] return_datatype_ method_name(data_type param1, data_type param2,...)
	public static void main(String[] args) {
		// data
		// biến cục bộ (thuộc tính)
		// cú pháp: [final] datatype variablename

		// BLOCK SCOPE {}
		// Q: Vì sao thuộc tính thì có thể khai báo [private][static] nhưng biến cục bộ thì không?
		// A: Biến cục bộ chỉ dùng trong block code hiện tại
		// Gọi trực tiếp --> Không cần lấy Class. --> không cần static
		// Không được dùng bên ngoài scope/method/class --> không cần access modifier
		
		double price = 99.99d;
		System.out.println("price: " + price); // print local variable
		System.out.println("price: " + Ex01BasicDemo.price); // print global variable
	}

}
