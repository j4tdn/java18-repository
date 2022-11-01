package data.primitive;

public class Ex02DataStorage {
	public static void main(String[] args) {
//		vt = vp
//		thứ tự thực hiện vp trước, được giá trị thì gán cho vế trái
		int a = 24;
		int b = 42;
		System.out.println("a1: " + a);
		System.out.println("b1: " + b);
		a = b;
//		gán b cho a
		System.out.println("a2: " + a);
		System.out.println("b2: " + b);
		
//		cần 1 chức năng thay đổi -methoname- giá trị của a-tham số- thành 1 giá trị khác
		modify(a);

		
	
	}
//	hàm khai báo và thân hàm
//	truyền tham số qua hàm --> PASS BY VALUE at STACK 
//	biến toàn cục có thể trùng tên vs biến cục bộ
	private static void modify(int input)
	{
		input = 159;
	}
}
