package data.primitive;
// lưu trữ bộ nhớ ở đâu
public class Ex02DataStorage {
	public static void main(String[] args) {
		// VT = VP
		//thứ tự thực hiện VP trước, được giá trị hì gán cho VT
		int a = 24; // trước dấu bằng là vế trái sau là vế phải
		int b = 42; // vế phải thực hiện trước
		System.out.println("a1: "+a);
		System.out.println("b1: "+b);
		
		// = gán giá trị(STACK) của biến b cho biến a
		a=b;
		
		System.out.println("a2:" +a); //42
		System.out.println("b2:" +b); //42
		
		
		//cần 1 chức năng thay đổi - method-name giá trị của a - tham số
		//thành 1 giá trị khác
		//
		modify(a); //a=42
		System.out.println("a3:" +a); //159 42
		
	}
	//Hàm
	//Hàm gồm khái báo, thân hàm
	//int input = a; //input =42, a=42, a=42
	//                             =159
	//trong 2 scopes {} khác nhau thì có thể khai biến trùng tên
	//trong 1 {} thì không thể cho 2 biến trùng tên
	//BIẾN TOÀN CỤC CÓ THÊ TRÙNG TÊN VỚI BIẾN CỤC BỘ
	//truyền tham số qua hàm --> PASs BY VALUE at STACK(truyền giá trị stack qua)
	private static void modify(int input) {
		input = 159;
	}
	
	
}
