package inheritance.interfaces.fromjava08;

public class FromJava08Demo {
	public static void main(String[] args) {
		// c1 : Tao 1 lop thuc thi
		// Demo --> even number condition
		Condition c1 = new EvenNumberCondition();
		System.out.println("c1 --> " + c1.test(12));
		
		// c2 : Anonymous class
		// Demo --> odd number condition 
		Condition c2 = new Condition() {
			@Override
			public boolean test(int a) {
				return a % 2 != 0;
			}
		};
		System.out.println("c2 --> " + c2.test(12));
		
		// c3 : Anonymous function (lambda expression)
		// Demo --> power of 3
		//(danh sách tham số) -> {
		//
		//}
		
		// mục đích : tạo ra đối tượng cho biến kiểu functional interface
		// code : đoạn lambda override hàm trừu tượng bên trong KDL 
		// funtional interface của biến đó
		Condition c3 = (int number) -> {
			return number % 3 == 0;
		};
		
		// Ngắn gọn
		// 1 -> Không cần khai báo KDL của tham số
		// 2 -> Khi số lượng của tham số = 1 --> Bỏ ()
		// 3 -> Khi phần body chỉ có 1 dòng	--> Bỏ luôn {}
		// nếu có return --> bỏ luôn return
		// nếu không có --> code bth
		
		Condition c4 = number -> number % 4 == 0;
		
		
	}
}
