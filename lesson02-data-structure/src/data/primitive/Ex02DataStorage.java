package data.primitive;

public class Ex02DataStorage {
	public static void main(String[] args) {
		//VT = VP
		// Thứ tự thực hiện là VP trước, có giá trị gán cho VT
		int a = 24;
		int b = 42 ;
		
		//gán giá trị biến b cho a
		a = b;
		
		//Cần 1 chức năng thay dổi giá trị của a
		modify(a);
		System.out.println(a);
	}
	
	//hàm
	private static void modify(int abc) {
		abc = 150;
		System.out.println(abc);
	}
}
