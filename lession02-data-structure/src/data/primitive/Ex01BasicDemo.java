package data.primitive;

public class Ex01BasicDemo {
	//private: Sử dụng trong class hiện tại
	//public: sử dụng trong class hiện tại và ở ngoài class hiện tại
	
	//todo: lesson03-oop
	//static: thuộc phạm vi của class
	//		: tất cả các đối tượng được tạo ra từ class này sẽ có chung một
	//giá trị của biến/thuộc tính static.
	// code: để gọi biến/thuộc tính static --> ClassName.staticVarriableName
	

	//non-static: thuộc phạm vi của từng đối tượng
	//			: mỗi đối tượng sẽ lưu trữ/mang một giá trị riêng
	//			: để gọi biến/thuộc tính non-static --> ObjectName.NonstaticVarriableName
	
	//biến toàn cục
	private static final int age = 20;
	public static final double price = 20.6;
	private static final float avg = 20.6f;
	public char letter = 'A';
	
	public static void main(String[] args) {
		int total = 222;
		//vì sao thuộc tính thì có thể khai bóa [private] [static]
		//nhưng biến cục bộ thì không
		
		//trả lời: Biến cục bộ chỉ dùng trong block code hiện tại
		//gọi trực tiếp --> không cần lấy class chấm --> không cần static
		// không được dùng bên ngoài scope/method/class --> không access modified
		
		double price = 99.99d;
		System.out.println("price: " + price);
		System.out.println("price: " + Ex01BasicDemo.price);
	}
}
