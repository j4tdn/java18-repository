package inheritance.interfaces.fromjava08;

// From Java08
// Condition -- boolean test(int number)

public class Java08Demo implements Condition {
	public static void main(String[] args) {
		// cách 1 : tạo 1 lớp thực thi
		// demo --> evev number condition
		
		// cách 2 : sử dụng anonymous class
		// demo --> old number condition
		
		// cách 3 : sử dụng anonymous function - lamdba 
		// demo --> old & even
	}

	@Override
	public boolean test(int a) {
		// TODO Auto-generated method stub
		return false;
	}
}
