package demo;

public class Ex01ProgramStructure {
	// comment: ignore for running
	// main: ctrl space
	// sysout: ctrl space
	// "sequence"
	// format code: ctrl shift f
	// Program(C/C++/JAVA)
	// + data structure: lưu trữ dữ liệu
	// + method/function: hàm/chức năng để xử lý bài toán
	
	// Bài toán + 2 số
	// dữ liệu: 2 số nguyên a và b
	// chức năng: tính tổng(input: a và b  -- output: tổng của a và b)
	// Run  : Chạy 1 phát xong luôn   --> Ctrl F11
	// Debug: Xem chạy từng dòng code --> F11
	// Break point: Điểm dừng
	public static void main(String[] args) {
		System.out.println("Welcome to class");
		int value = sum(5, 10);
		System.out.println("Result " + value);
	}
	
	// Khai báo hàm, chức năng
	public static int sum(int a, int b) {
		return a + b;
	}
}
