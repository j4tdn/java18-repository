package inheritance.interfaces.fromjava08;


//From java08
public class Java08Demo {
	public static void main(String[] args) {
		//Cách 1: tạo lớp thực thi
		//Demo --> EvenNumberCondition

		//Cách 2: Sử dụng anonymous class
		//Demo --> odd number condition
		Condition c1 = new Condition() {
			@Override
			public boolean test(int a) {
				// TODO Auto-generated method stub
				return a % 2 != 0;
			}
		};
		System.out.println( c1.test(13));
		
		//Cách 3: Sử dụng anonymus function - lamda expressiom
		//Demo --> even & odd
		//anonymus function --> đoạn code override lại hàm trừu tượng 
		//trong functional interface
		//(danh sách tham số) -> {
		//		đoạn code override
		// }
		
		
		//lambda
		// Mục đích: tạo ra đối tượng cho kiểu functional interface
		// Code: đoạn lambda override hàm trừu tượng bên trong KDL
		// 		functional interface của iến đó
		Condition c3 = (int digit) ->{
			return digit % 3 == 0;
		};
		
		//Ngắn gọn:
		// 1. Kh cầm khai báo KDL tham số
		// 2. khi tham số = 1 --> bỏ ()
		// 3. Khi body có 1 dòng --> bỏ {}
		//						nếu có return --> bỏ luôn return
		Condition c4 = x -> x % 4 == 0;
	}
}
