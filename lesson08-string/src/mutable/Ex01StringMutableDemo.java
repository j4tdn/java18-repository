package mutable;

public class Ex01StringMutableDemo {
	public static void main(String[] args) {
		
		//hầu hết các trường hợp đều sử dụng String Literal
		
		//khi thực hiện các thao tác +- chuỗi có số lượng ô nhớ trung gian
		// tạo ra quá nhiều, đa luồng
		
		//immutable
		//immutable object là object ở HEAP mà ko thể
		//thay đổi/set được giá trị biến(s) bên trong
		
		
		//mutable --> StringBuilder, StringBuffer
		//mutable object là object ở HEAP mà có thể
		//thay đổi/set được giá trị biến(s) bên trong
		
		// TODO: giống nhau --> mutable, hàm sử dụng
		// TODO: khách nhau --> đơn luồng, đa luồng
		
		//StringBuilder/Buffer là wrapper/container chứa thuộc tính
		//thuộc tính có KDL là string
		
		StringBuilder sb = new StringBuilder("hello ")
				.append("from ")
				.append("viet nam");
		System.out.println("sb --> " + System.identityHashCode(sb)+ "-->" + sb);
		
		sb.append(" 2023");
		System.out.println("sb --> " + System.identityHashCode(sb)+ "-->" + sb);
		
		StringBuilder sequence = new StringBuilder();
		for (int i = 1; i < 1000; i++) {
			sequence.append(i);
		}
		System.out.println("sequence: " + System.identityHashCode(sequence) + "--> " + sequence);
	}

}
