package data.primitive;

public class Ex02DataStorage {
	public static void main(String[] args) {
		// VT = VP
		// Thứ tự thực hiện :  VP trước, được giá trị thì gán cho VT
		int a = 24;
		int b = 42;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		// = Gán giá trị (STACK) của biến b cho a
		a = b;
		System.out.println("a2 : " + a);
		System.out.println("b2 : " + b);
		
		System.out.println(a);
		
		//		Integer c = new Integer(15);
		//		Change(c);
		//		System.out.println(c);
		
		// Cần 1 chức năng thay đổi giá trị a thành 1 giá trị khác
		
		Number c1 = null ;
		Change(c1);
		System.out.println(c1.spell + c1.val);
		
	}
	
	public class Number{
		public int val;
		public String spell;
		
		public Number(int val, String spell) {
			this.val = val;
			this.spell = spell;
		}
	}
	
	
	
	// Hàm
	// Truyền tham số qua hàm --> PASS BY VALUE at STACK
	// Biến toàn cục có thể trùng tên với biến cục bộ
	private static void Change(Number n) {
		n.val = 15;
		n.spell = "fifteen";
	}
	
	private static void Modify(Integer n) {
		n = 15;
	}
	
}
