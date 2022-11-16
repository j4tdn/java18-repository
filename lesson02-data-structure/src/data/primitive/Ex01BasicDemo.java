package data.primitive;

// class(Ex01BasicDemo): KDL doi tuong ~ Interger ~ Int
// int a = 5; int b = 10;
// Ex01BasicDemo o1 = ...; Ex01BasicDemo o2 = ...
public class Ex01BasicDemo {
	// private: sử dụng trong class hiện tại
	// public: sử dụng trong class hiện tại và ngoài class hiện tại
	// TODO: lesson03-oop
	// static: thuộc phạm vi của class
	// : tất cả các đối tượng được tạo ra từ class này
	// : sẽ có chung giá trị của biến/thuộc tính static
	// code : để gọi biến/thuộc tính static -->ClassName.staticVariableName;
	// --> Nếu trong class hiện tại --> staticVariableName.
	// non-static: thuộc phạm vi của từng đối tượng
	// : mỗi đối tượng sẽ lưu trữ/ mang một giá trị riêng
	// code : để gọi biến/thuộc tính non-static -->
	// ObjectName.nonStaticVariableName;

	// dữ liệu
	// biến toàn cục(thuộc tính)
	// cú pháp:
	private static int age = 20;
	public static final double price = 20.6;
	private static final float avg = 20.6f;
	public char letter = 'A';

	// chức năng

	public static void main(String[] args) {
		// dữ liệu
		// biến cục bộ(thuộc tính)
		// cú pháp:

		// BLOCK SCOPE {}
		/* private static */ int total = 222;

		// Vì sao thuộc tính thì có thể khai báo [private] [static]
		// nhưng biến cục bộ thì không
		// Trả lời: Biến cục bộ là chỉ dùng trong BLOCK SCOPE hiện tại
		// Gọi trực tiếp không cần lấy class chấm --> không cần static
		// Không được dùng bên ngoài scope/method/class --> không cần access modifier

		Ex01BasicDemo.age = 30;

		double price = 99.99d;
		System.out.println("local price: " + price);
		System.out.println("global price: " + Ex01BasicDemo.price);
	}

	public static void demo() {
		age = 60;
		// total = 22;
	}
}
