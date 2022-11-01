package data.primitive;

// Class : KDL đối tượng ~ Integer ~ int ** Giá trị lưu trữ ở HEAP, mặc định khi khởi tạo là null
public class Ex01BasicDemo {
	// private : use only in present class 
	// public : use in every class of project
	
	// static : thuộc phạm vi của class
	//		  : *** CHỈ CLASS ĐƯỢC GỌI ***
	//        : => Tất cả các đối tượng được tạo ra từ class này sẽ có cùng giá trị của biến/ thuộc tính static
	// code   : để gọi biến/ thuộc tính static --> ClassName.staticVariableName
	// 										   --> Nếu trong class hiện tại --> staticVariableName
	
	// non-static : thuộc phạm vi của từng đối tượng
	//            : *** CHỈ ĐỐI TƯỢNG ĐƯỢC GỌI ***
	// code       : để gọi biến/ thuộc tính non-static --> ObjectName.nonStaticVariableName
	
	// data
	// biến toàn cục (thuộc tính)
	
	public static int age = 20;
	public static double price = 20.6;
	public static float avg = 20.6f;
	char letter = 'A';
	

	//function
	public static void main(String[] args) {
		// data
		// biến cục bộ (thuộc tính)
		// --> Biến cục bộ chỉ dùng trong block scope hiện tại => Không cần lấy class. => Không cần static, gõ trực tiếp
		// Không được dùng bên ngoài scope/ method/ class => Không cần access modifier
		Ex01BasicDemo o1 = new Ex01BasicDemo();
		o1.letter = 'B';
		// BLOCK SCOPE {}
		int total = 222;
		// demo();
		System.out.println(o1.letter);
	}
	
	public static void demo() {
		int age = 30;
		System.out.println("local : " + age);
		System.out.println("global : " + Ex01BasicDemo.age);
	}
}
