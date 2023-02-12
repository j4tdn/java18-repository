package mutable;

public class Ex01StringMutableDemo {
	public static void main(String[] args) {
		// Hầu hết các trường hợp đều sử dụng String Literal
		
		// Khi thực hiện các thao tác +- chuỗi số lượng ô nhớ trung gian
		// tạo ra quá nhiều ==> Sử dụng String Mutable
		
		// TODO: đơn luồng, đa luồng
		
		// immutable
		// immutable object là object ở HEAP mà >>ko<< thể
		// thay đổi/set được giá trị của biến(s) bên trong
		
		// mutable --> StringBuilder, StringBuffer
		// mutable object là object ở HEAP mà >>có<< thể
		// thay đổi/set lại giá trị của biến(s) bên trong
		
		// StringBuilder vs StringBuffer --> builder pattern option adv
		// TODO: Giống nhau --> mutable, hàm sử dụng
		// TODO: Khác nhau  --> đơn luồng, đa luồng
		
		// StringBuilder/Buffer là wrapper/container chứa thuộc tính
		// có KDL là String
		
		// StringBuilder
		//     value(String)
		StringBuilder sb = new StringBuilder("hello")
				.append(" from")
				.append(" viet nam");
		System.out.println("sb --> " + System.identityHashCode(sb) + " --> " + sb);
		
		// append, delete, setCharAt
		
		sb.append(" 2023");
		System.out.println("sb --> " + System.identityHashCode(sb) + " --> " + sb);
		
		// string +=
		StringBuilder sequence = new StringBuilder();
		for (int i = 1; i <= 1000; i++) {
			sequence.append(i);
		}
		
		System.out.println("sequence --> " + System.identityHashCode(sequence) + " --> " + sequence);
	}
}
