package demo;

public class Ex01ProgramStructure {
	// comment:ignore for running
	// main:ctrl space
	// sysout:ctrl space
	// "sequence"
	// format code: ctrl shift F. se định dạng lại code
	// Program(C/C++/Java)
	// +data structure: luu tru du lieu
	//+ method/function: ham/chuc nang  de xu ly
	
	//Bai toan +2 so
	// du lieu: 2 so nguyen a va b
	// chuc nang: tinh tong (input: a và b -- output: tổng a và b)
	// RUN: ctrl F11 , chay 1 phat xong luon
	// Debug: F11, Xem chay tung dong code
	// Break point: Điểm dừng
	public static void main(String[] args) {
		System.out.println("Welcom to class");
		int value = sum(5,10);
		System.out.println("Result " + value);
	}
	
	// Khai bao ham, chuc nang
	public static int sum(int a, int b) {
		return a + b;  
	}
}
