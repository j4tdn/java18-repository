package mutable;

public class Ex01StringMutableDemo {
	public static void main(String[] args) {
		//Hầu hết các trường hợp đều sử dụng String Literal
		
		// Khi thực hiện các thao tác +- chuỗi số lượng ô nhớ trung gian
		// tạo ra quá nhiều ==> Sử dụng String Mutable
		
		//Inmutable
		//Inmutable object là object ở HEAP mà không thể thay đổi được giá trị của biến bên trong
		
		//Muntable 
		//mutable object là object ở HEAP mà có thể thay đổi được giá trị của biến bên trong
		
		//StringBuilder vs StringBuffer
		//TODO: Giống nhau -> mutable, hàm sử dụng
		//TODO: Khác nhau -> đơn luồng, đa luông
		
		//StringBuilder/Bufer là wrapper/container chứa thuộc tính
		//có KDL là String
		
		//StringBuilder 
		//			value(String)
		StringBuilder sb = new StringBuilder("hello")
				.append("from")
				.append("VN");
		System.out.println("sb: "+System.identityHashCode(sb)+" --> "+sb);
		
		//String +=
		StringBuilder sequence = new StringBuilder();
		for(int i = 1;i<=1000;i++) {
			sequence.append(i);
			System.out.println("sequence: "+System.identityHashCode(sequence));
		}
	}
}
