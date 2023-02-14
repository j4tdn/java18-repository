package mutable;

/**
 * Hầu hết các trường hợp đều sử dụng String literal 
 * 
 * Chỉ khi thực hiện các thao tác +- chuỗi --> số lượng ô nhớ trung gian tạo ra quá nhiều
 * => dùng String mutable 
 * VD: String sequence = "";
 * for (int i = 1; i <= 1000; i++) {
 * sequence += i;
 * System.out.println("sequence --> " + System.identityHashCode(sequence) + " --> " + sequence);
 * ↓
 * Tạo 1000 ô nhớ => take memory => recommend sử dụng String mutable (StringBuilder/StringBuffer)
 */

public class Ex01StringMutableDemo {
	public static void main(String[] args) {
		// immutable 
		// immutable object là object ở HEAP 
		// mà ko thể thay đổi/set được giá trị của biến (s) bên trong
		
		// mutable --> StringBuilder, StringBuffer --> builder pattern (option adv)
		// mutable object là object ở HEAP 
		// mà có thể thay đổi/set được giá trị của biến (s) bên trong
		
		// Giống nhau của StringBuilder, StringBuffer --> mutable, hàm sử dụng 
		// Khác nhau --> đơn luồng, đa luồng
		
		// StringBuilder/Buffer là wrapper/container chứa thuộc tính
		// có KDL là String
		
		// StringBuilder
		// có thuộc tính value (kiểu String)
		StringBuilder sb = new StringBuilder("hello")
				.append(" from")
				.append(" viet nam"); 
		System.out.println("sb --> " + System.identityHashCode(sb) + " --> " + sb);
		// sb --> 1365202186 --> hello from viet nam
		
		sb.append(" 2023");
		System.out.println("sb --> " + System.identityHashCode(sb) + " --> " + sb);
		// sb --> 1365202186 --> hello from viet nam 2023
		
		// append, delete, setCharAt
		
		// vD khi thực hiện các thao tác + chuỗi
		StringBuilder sequence = new StringBuilder();
		for (int i = 1; i < 1000; i++) {
			sequence.append(i);
		}
		System.out.println("sequence --> " + System.identityHashCode(sequence) + " --> " + sequence);
	}

}
