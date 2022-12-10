package inheritance.interfaces.fromjava08;

//from java08
public class Java08Demo {
	public static void main(String[] args) {
		// Cach 1: tao 1 lop thuc thi
		// demo --> Even number condition

		
		// cach 2: su dung anonymous class
		// demo --> odd number condition
		Condition c2 = new Condition() {

			@Override
			public boolean test(int a) {
				return a % 2 != 0;
			}

		};
		System.out.println("c2 --> " + c2.test(27));

		// cach 3: su dung anonymous function - lamdba expression
		// demo --> even & odd
		//anonymous function --> đoạn code override lại 
		// hàm trừu tượng trong functional interface
		// ( danh sách tham số) -> {
		//		đoạn code override
		// }
		
		
		//lambda
		// mục đích: tạo ra đối tượng cho biến kiểu functional interface 
		//code: đoạn lambda  override hàm trừu tượng bên trong KDL functional interface của biến đó
		Condition c3 = (int digit) -> {
			return digit % 3 == 0;
		};
		System.out.println(" c3 " + c3.test(24));
		
		/*
		 * Ngắn gọn 
		 * 1 --> không cần khai báo KDL của tham số 
		 * 2 --> khi số lượng tham số = 1 --> bỏ ngoặc ()
		 * 3 --> khi body chỉ có 1 dòng --> bỏ luôn {}
		 * 	 	lúc này có 2 TH:
		 * 		a. nếu có return -> bỏ luôn return, tự hiể
		 * 		b. không có return-> code bình thường
		 * 		
		 */
		Condition c4 = x -> x % 4 == 0;
		System.out.println("c4 -->" + c4.test(23));
	}
}
