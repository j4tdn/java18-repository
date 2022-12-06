package inheritance.interfaces.fromjava08;

// From java08
public class Java08Demo {
	public static void main(String[] args) {
		//Cách 1: Tạo 1 lớp thực thi
		//Demo --> even number condition
		Condition c1 = new EvenNummberCondition();
		System.out.println("c1 --> " + c1.test(12));
		
		// Cách 2: Sử dụng anonymous class
		//Demo --> odd number condition
		Condition c2 = new Condition() {
			
			@Override
			public boolean test(int a) {
				return a % 2 == 1;
			}
		};
		System.out.println("c2 --> " + c2.test(12));
		
		// Cách 3: Sử dụng anonymous function - lambda expression
		//Demo --> power of 3
		//anonymous function --> đoạn code override lại hàm
		//trừu tượng trong function interface
		
		//(danh sách tham số) -> {
		
		//}
		
		//lambda
		//mục đích: tại ra đói tượng cho biến kiểu functional interface
		//code: override hàm trừu tượng bên trong
		//		KDL functional interface của biến đó
		
		Condition c3 = (int a) -> {
			return a % 3 == 0;
		};
		System.out.println("c3 --> " + c3.test(12));
		
		//ngắn gọn
		// 1 --> k cần khai báo KDL của tham số
		// 2 --> khi số lượng tham số bằng 1 ==> bỏ dấu ()
		// 3 --> khi body chỉ có 1 dòng
		//				--> bỏ luôn {}
		//						nếu có return thì bỏ luôn return
		
		Condition c4 = a -> a % 3 == 0;
		System.out.println("c4 --> " + c4.test(12));
		
	}

}
