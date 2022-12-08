package inheritance.interfaces.fromjava08;

// From Java08
// Condition -- boolean test(int number)
public class Java08Demo {
	public static void main(String[] args) {
		// Cách 1: Tạo 1 lớp thực thi
		// Demo --> even number condition
		Condition c1 = new EvenNumberCondition();
		System.out.println("c1 --> " + c1.test(12));
		
		// Cách 2: Sử dụng anonymous class
		// Demo --> odd number condition
		Condition c2 = new Condition() {
			
			@Override
			public boolean test(int a) {
				return a % 2 != 0;
			}
		};
		System.out.println("c2 --> " + c2.test(12));
		
		// Cách 3: Sử dung anonymous function - lamdba expression
		// Demo --> power of 3
		// Demo --> power of 4
		// anonymous function --> đoạn code override lại
		// hàm trừu tượng trong functional interface
		// (danh sách tham số) -> {
		//		// đoạn code override
		//}
		
		// lambda
		// mục đích: tạo ra đối tượng cho biến kiểu functional interface
		// code: đoạn lambda override hàm trừu tượng bên trong
		// 	     KDL functional interface của biến đó
		Condition c3 = (int digit) -> {
			return digit % 3 == 0;
		};
		System.out.println("c3 --> " + c3.test(16));
		
		// Ngắn gọn
		// 1 --> ko cần khai báo KDL của tham số
		// 2 --> khi số lượng tham số = 1 --> bỏ ngoặc ()
		// 3 --> khi body chỉ có 1 dòng 
		//          --> bỏ luôn {}
		//                nếu có return --> bỏ luôn return, tự hiểu
		//                không có return --> code bình thường
		Condition c4 = x -> x % 4 == 0;
		System.out.println("c4 --> " + c4.test(18));
	}
}