package mutable;

public class Ex01StringMultableDemo {
	public static void main(String[] args) {
		// Hầu hết các trường hợp đều sử dụng String Literal
		
		//Khi thực hiện các thao tác +- chuỗi cần tốn số lượng lớn ô nhớ trung gian
		// --> sử dụng String Mutable
		
		// immutable
		// immutable object là object ở heap mà không thể thay đổi được giá trị của biến bên trong
		
		// multable --> StringBuilder, StringBuffer
		// mutable object là object ở heap mà có thể thay đổi được giá trị của biến bên trong
		
		// StringBuilder vs StringBuffer  --> builder pattern
		// TODO: Giống nhau --> mutable, hàm sử dụng
		// TODO: Khác nhau --> đơn luồng, đa luồng
		
		// StringBuilder/Buffer là 1 wrapper/container chứa thuộc tính
		// có kdl là String
		StringBuilder sb = new StringBuilder("Hello")
								.append(" from")
								.append(" hell");
		System.out.println("sb --> " + System.identityHashCode(sb) + " " + sb);
		sb.append(" 2023");
		System.out.println("sb --> " + System.identityHashCode(sb) + " " + sb);
		
		StringBuilder sq = new StringBuilder();
		
		for (int i = 1; i <= 1000; i++) {
			sq.append(i);
		}
		System.out.println("sq " + System.identityHashCode(sq) + " --> " + sq);
		
	}
	
}
