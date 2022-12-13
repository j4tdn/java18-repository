package inheritance.interfaces.fromjava08;

// From Fava08
// Condition -- boolean test(int number)
public class Java08Demo {
	public static void main(String[] args) {
		// Cách 1: Tạo 1 lớp thực thi
		// Demo --> Even number condition
	
		// Cách 2: Sử dụng anonymous class
		// Demo --> odd number condition
		
		Condition c2 = new Condition() {
			@Override
			public boolean test(int a) {
				return a % 2 != 0;
			}
		};
	
		
		// Cách 3: Sử dụng anonymous function - lambda expression
		// Demo --> power of 3
		// anonymous function --> đoạn code override lại
		
		Condition c3 = (int digit) -> {
			return digit % 3 == 0;
		};
		System.out.println("c3 --> " + c3.test(16));
	}
}
