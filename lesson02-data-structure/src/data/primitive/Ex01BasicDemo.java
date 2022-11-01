package data.primitive;

// class : kdl đối tượng 

public class Ex01BasicDemo {
//	 du lieu
//	 private: chỉ đc sử dụng trong class hiện tại
//	 public: sử dụng trong class hiện tại và ngoài class hiện tại
//	 static: thuộc phạm vi của class, tất cả các đối tượng đc tạo ra từ class này 
//		     sẽ có chung giá trị của biến , thuộc tính static
//	 code : để gọi biến static --> ClassName.staticVariableName
//	 non-static: thuộc phạm vi của đối tượng
//	 code : để gọi biến non-static --> ObjectName.nonstaticVariableName
//	 mỗi đối tượng sẽ lưu trữ mang một giá trị riêng
	private static final int age = 20;
	public static final double price = 20.6;
	private static final float avg = 20.6f;
	public char letter = 'A';
	
	public static void main(String[] args) {
//		dữ liệu
//		biến cục bộ(thuộc tính)
//		cú pháp [final] datatype variable
//		block scope {}
		/*private static*/final int total = 222;
		double price = 99.99;
		System.out.println("local price :"+ price);
		System.out.println("local price :"+ Ex01BasicDemo.price);
//		biến cục bộ chỉ dùng trong block code hiện tại
//		gọi trục tiếp tên biến --> ko cần class --> nên không cần static
//		ko dùng đc bên ngoài scope --> ko cần access modifier
		
	}

}
