package muttable;

public class Ex01StringMutableDemo {
	// immutable 
	// immutable object là object ở HEAP mà không thể thay đổi được giá trị bên trong
	
	// mutable --> 
	// mutable object là object ở HEAP mà có thể thay đổi / set giá trị bên trong
	
	// StringBuilder, StringBuffer
	// Giống nhau --> mutable, hàm sử dụng
	// Khác nhau --> đơn luồng, đa luồng
	
	// StringBuilder/Buffer là wrapper/container chứa thuộc tính có KDL là String
	

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello")
				.append(" from")
				.append(" viet nam");
		System.out.println("sb --> " + System.identityHashCode(sb) + " --> " + sb);
		
		sb.append(" 2023");
		System.out.println("sb --> " + System.identityHashCode(sb) + " --> " + sb);
		
		// string +=
		StringBuilder sequence = new StringBuilder();
		for(int i = 1; i <= 1000; i++) {
			sequence.append(i);
			System.out.println("sb --> " + System.identityHashCode(sb) + " --> " + sb);
		}
		
	}
}
