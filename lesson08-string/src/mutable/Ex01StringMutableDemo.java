package mutable;

public class Ex01StringMutableDemo {
	// Hau het cac truong hop deu su dung String LIteral
	// Khi thuc hien cac thao tac +- chuoi so luong o nho trung gian
	// tao ra qua nhieu
	
	// immutable
	// immutable object o HEAP ma khong the thay doi duoc gia tri cua bien ben trong
	
	// mutable --> StringBuilder, StringBuffer
	// immutable object o HEAP ma co the thay doi duoc gia tri cua bien ben trong
	
	// StringBuilder vs StringBuffer
	// TODO: giong nhau --> mutable, ham su dung
	// TODO: khac nhau --> don luong, da luong
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello")
				.append(" from")
				.append(" Viet Nam");
		System.out.println("sb --> " + System.identityHashCode(sb) + " --> " + sb);
		
		sb.append("2023");
		System.out.println("sb --> " + System.identityHashCode(sb) + " --> " + sb);
		
		StringBuilder sequence = new StringBuilder();
		for (int i = 1; i <= 1000; i++) {
			sequence.append(i);
		}
		
	}

}
