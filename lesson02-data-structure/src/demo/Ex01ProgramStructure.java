package demo;

public class Ex01ProgramStructure {
	// comment: ignore or running
	// main: ctrl + space
	// sysout: ctrl + space
	//format code: ctrl shift f 
	// + data structure: lưu trữ dữ liệu
	// + method/function: hàm/chức năng để xử lý bài toán
	//Bài toán + 2 số
	// dữ liệu: 2 số nguyên a và b 
	// chức năng: tính tổng( input: a và b --output: tổng của a và b)
	//run: chạy 1 phát xong luôn --> ctrl f11
	//debug: chạy từng dòng code --> f11
	//break point : điểm dừng
	public static void main(String[] args) {
		System.out.println("Welcome to class");
		int value = sum(5, 10);
		System.out.println("Result " + value);
	}
	//khai báo hàm, chức năng 
	public static int sum(int a, int b) {
		return a + b;
	}
}

