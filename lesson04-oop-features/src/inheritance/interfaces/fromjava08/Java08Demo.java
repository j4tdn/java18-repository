package inheritance.interfaces.fromjava08;
//from java 08

public class Java08Demo {
	public static void main(String[] args) {
//		cách 1: tạo 1 lớp thực thi
//		demo --> even number
		Condition c1 = new EvenNumberCondition();
		System.out.println(c1.test(12));
		
		
//		cahchs 2: sử dụng anonymous class
//		demo --> odd number condition
		Condition c2 = new Condition() {
			
			@Override
			public boolean test(int a) {
				// TODO Auto-generated method stub
				return a%2 !=0;
			}
		};
		System.out.println(c2.test(13));
//		cách 3: sd anonymous function
//		demo --> vừa even & odd
//		anonymous fuctiom --> đoạn code override lại
//		hàm trừu tượng trong function interface
		
//		(danh sách tham số) -> {
//		
//		}
//		lambda: mục đích: tạo ra đối tượng cho biến kiểu function interface
//		code: đoạn code lambda override hàm trừu tượng  bên trong KDL functional interface của biến đó
		Condition c3 = (int digit) ->{
			return digit % 3 ==0;
		};
		System.out.println(c3.test(9));
		
//		Condition c4 = new Condition() {
//			
//			@Override
//			public boolean test(int a) {
//				// TODO Auto-generated method stub
//				return a%4 == 0;
//			}
//		};
//		1 : không cần khai báo KDL của tham số
//		2 : khi số lượng tham số bằng 1 --> bỏ dấu ngoặc
//		3 : khi phần body chỉ có 1 dòng thì bỏ buôn {}, nếu có return thì sẽ bỏ luôn return, nếu ko có return code bình thường
		Condition c4 = x -> x%4 == 0;
		System.out.println(c4.test(9));
	}

}
