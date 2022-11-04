package data.primitive;

// Class(Ex01BasicDemo): KDL đối tượng ~ Integer ~ int
//int a = 5; int b = 10;
// Ex01BasicDemo o1 = new Ex01BasicDemo( ..,..,..,..) Ex01BasicDemo
// Ex01BasicDemo --> class
// o1, o2 :.....

public class Ex01BasicDemo {
	
	// private: Chỉ sử dụng trong class hiện tại
	// public: Sử dụng trong class hiện tại và ngoài class hiện tại
	// TODO: lesson03-oop
	// static: thuộc phạm vi của class
	//		 : có nghĩa là tất cả các đối tượng được tạo ra từ class này, sẽ có chung 1 giá trị của biến/ thuộc tính static
	// code: để gọi biến/thuộc tính static --> ClassName.staticVariableName;
	//									--> Nếu trong class hiện tại, thì gọi bằng staticVariableName ( không cần ClassName)
	
	// non-static: thuộc phạm vi của từng đối tượng.
	//			 : có nghĩa mỗi đối tượng sẽ lưu trữ/ mang 1 giá trị riêng.
	// code: để gọi biến/thuộc tính non-static, --> ObjectName.nonStaticVariableName
	
	
	// dữ liệu
	// biến toàn cục (thuộc tính)
	// cú pháp: [......]
	private static final int age = 20;
	public static final double price = 20.6d;
	private static final float avg = 20.6f;
	public char letter = 'A';
	
	
	// chức năng
	// cú pháp: .........
	public static void main(String[] args) {
		// dữ liệu
		// biến cục bộ(thuộc tính)
		// cú pháp: [final] datatype varialename
		
		// BLOCK SCOPE {}
		/*private static*/ int total =222;
		// vì sao thuộc tính thì có thể khai báo (private] [static], nhưng biến cục bộ thì không
		//Trả lời: Biến cục bộ chỉ dùng trong block code hiện tại,
		// gọi trực tiếp --> không cần lấy class chấm --> không cần static
		// không được dùng bên ngoài scope/method/class --> không cần access modifier
		
	double price 99.99d;
	System.out.println("price:" + price);
	System.out.println("global price:" + Ex01BasicDemo.price);
	}	
		public static void demo() {
			age = 60;
			//total =22;
		}
		
	
}
