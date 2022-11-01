package data.primitive;

public class Ex02DataStorage {
	public static void main(String[]args) {
		//VT = VP
		//thứ tự thực hiện VP trước, được giá trị
		//thì gán cho VT
		
		int a = 24;
		int b = 42;
		
		System.out.println("a1: "+ a);
		System.out.println("b1: "+ b);
		//Gán giá trị(STACK) của biến b cho biến a
		a = b;
		
		System.out.println("a2: "+ a);
		System.out.println("b2: "+ b);
		
		//cần 1 chức năng thay đổi giá trị của a thành 1 giá trị khác
		modify(a);//=42
	}
	//hàm
	private static void modify(int input) {
		input = 159;
	}

}
