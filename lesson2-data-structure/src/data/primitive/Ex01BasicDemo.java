package data.primitive;
// class(Ex01BasicDemo(age, price, avf, letter)) : KDL đối tượng = int = integer
//
//int a= 5; int b=10;
//Ex01BasicDemo o1=new Ex01BasicDemo(..,.,..,...,); Ex01BasicDemo o2=...;
//Ex01BasicDemo --> class
//o1, o2 --> object(đối tượng) được taoh ra từ class Ex01BasicDemo
public class Ex01BasicDemo {
	// private : chỉ được sử dụng class hiện tại
	// public  : SỬ dụng trong class trong hoặc ngoài class hiện tại
	// static  : thuộc phạm vi của class
	//         : tất cả các đối tượng được tạo ra từ class này
	//          : sẽ có chung một giá trị của biến/ thuộc tính static
	
	//CODE : để gọi biến/thuộc tính static --> ClasName.staticVariableName;
	//                                     -->nếu trong class hiện tại -->ClasName.staticVariableName;
	// non-static(KHÔNG PHẢI STATIC) : thuộc phạm vi của từng đối tượng
	//                               : mỗi đối tượng lưu trứ/ mang một giá trị riêng
	//CODE : để gọi biến/thuộc tính static -->  ObjectName.nonstaticVariableName;
	//Dữ liệu
	//biến toàn cục(thuộc tính)
	//cú pháp: [access modifier] [static] [final] datatype variablename 

	private static  int age = 20;
	public static  double price = 20.6d;
	private static  float avg = 20.6f;
	public char letter = 'A';
	
	//Chức năng 
	//Cú pháp :[access modifier] [static] return_datatype method_name(data_type param1,int, ...)(main)
	
	
	public static void main(String[] args) {
		//Dữ liệu
		//biến toàn cục(thuộc tính)
		//cú pháp: [final] datatype variablename 
		
		// BLOCK SCOPE {} phạm vi sử dụng từ ngoặc nhọn trước đó 
		/*private static*/ int total = 222;
		
		// vì sao thuộc tnhs thì có thể khai báo [private] [static]
		// nhưng biến cục bộ thì không
        //--> biến cục bộ chỉ dùng trong block code hiện tại
		// gọi trực tiếp không cần lấy class chấm --> không cần static
		/// không được dùng ngoài scope/method/class--> không cần accsess modifier
		
		
		Ex01BasicDemo.age = 30;
		
		double price = 99.99d;
		System.out.println("price: "+ price);
		System.out.println("global price: "+ Ex01BasicDemo.price );
	}
    
	public static void demo() {
		age = 60;
	}
}
