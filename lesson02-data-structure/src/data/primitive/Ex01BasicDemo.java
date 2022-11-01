package data.primitive;

// Class(Ex01BasicDemo(age, price, avg, letter)): KLD đối tượng ~ Integer ~ int
// int a =5; int b = 10;
// Ex01BasicDemo o1 = ...; Ex01BasicDemo o2 = ...
// Ex01BasicDemo --> class
// o1, o2 --> objects được tạo ra từ class Ex01BasicDemo

public class Ex01BasicDemo {
	// private: Sử dụng trong class hiện tại
	// public: Sử dụng trong class hiện tại và ở ngoài class hiện tại
	
	//TODO: lesson03-oop
	// static: thuộc phạm vi của class
	//		 : tất cả các đối tượng được tạo ra từ class này
	//		 : sẽ có chung một giá trị của biến/thuộc tính static này
	//code	 : để gọi biến/thuộc tính static --> ClassName.staticVariableName;
	
	// non-static: thuộc phạm vi của từng đối tượng
	//			 : mỗi đối tượng sẽ lưu trữ/mang một giá trị riêng
	//code   : để gọi biến/thuộc tính non-static --> ObjectName.nonstaticVariableName;
	// dữ liệu
	// biến toàn cục(thuộc tính)
	// cú pháp [access modifier] [static] [final] datatype variablename
	private static final int age = 20;
	public static final double price = 20.6d;
	private static final float avg = 20.6f;
	char letter = 'A';
	
	// chức năng
	// cú pháp: [access modifier] [static] return_datatype method_name(data_type param1, data_type param2,....)
	public static void main(String[] args) {
		// dữ liệu
		// biến cục bộ(thuộc tính)
		// cú pháp: [final] datatype variablename
		
		//BLOCK SCOPE {}
		int total = 222;
		// Vì sao thuộc tính thì có thể khai báo [private][static]
		// nhưng biến cục bộ thì không
		
		// Trả lời: Biến cục bộ chỉ dùng trong block code hiện tại
		// Gọi trực tiếp --> không cần lấy class chấm --> không cần static
		// Không được dùng bên ngoài scope/method/class --> không cần access modifier

	
	}
}
