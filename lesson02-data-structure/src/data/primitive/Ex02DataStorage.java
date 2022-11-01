package data.primitive;

public class Ex02DataStorage {
	public static void main(String[] args) {
		//VT = VP
		//Thứ tự thực hiện VP trước, được giá trị rồi gán cho VT		
		int a = 24;
		int b = 42;
		System.out.println("a1: "+a);
		System.out.println("b1: "+b);
		//gán giá trị (STACK) của b cho a
		
		a = b;
		modify(a);
		System.out.println("a2: "+a);
		System.out.println("b2: "+b);
		
	}
	//hàm
	private static void modify(int a) { 
		a = 90;
	}
}
