package data.primitive;

//Class(Ex01BasicDemo(age, price, avg, letter)): KDL đối tượng ~ Integer  ~ int
//int a = 5; int b = 10;
//Ex01BasicDemo o1 = new Ex01BasicDemo(..., ..., ..., ...).;Ex01BasicDemo  o2 = ...
//o1, o2 --> Object được tạo ra từ class Ex01BasicDemo
public class Ex01BasicDemo {
	//private: sử dụng trong class hiện tại
	// dữ liệu
	//public: sử dụng trong class hiện tại và ở ngoài class hiện tại
	
	//TODO: lesson03-oop
	//static: thuộc phạm vi  của class
	//		: tất cả các đối tượng được tạo ra từ class này
	//		: sẽ có chung giá trị của biến/thuộc tính static
	
	//code	: để gọi bến/thuộc tính static --> ClassName.staticVariableName
	
	//non-static: thuộc phạm vi của đối tượng;
	//			: mỗi đối tượng sẽ lưu trữ/mang một giá trị riêng
	//code		: để gọi bến/thuộc tính non static --> ObjectName.nonStaticVariableName

	
	//dữ liệu:
	//biến toàn cục(thuộc tính)
	//
	private static  int age = 20;
	public static  double price = 20.6d;
	private static  float  avg = 20.6f;
	public char letter = 'A';
	
	
	// chức năng

	public static void main(String[] args) {
		//dữ liệu:
		//biến toàn cục(thuộc tính)
		//cú pháp: [final] datatype variablename
		
		//BLOCK SCOPE {}
		/*private static*/int total = 222;
		// vì sao thuộc tính có thể khai báo [private] [static]
		//nhưng biến cục bộ thì không
		//trả lời: biến cục bộ chỉ dùng trong block code hiện tại
		//gọi trục tiếp --> không cần lấy class chấm --> không  cần static
		//không được dùng bên ngoiaf scope/method/class --> không cần access modifier
		
		Ex01BasicDemo.age = 30;
		
	}
	
	public static void demo() {
		age =60;
	//	total = 22;
	}
	

}
