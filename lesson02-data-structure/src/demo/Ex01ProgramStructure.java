package demo;

public class Ex01ProgramStructure {

	// Bài toán cộng 2 số
	// Dữ liệu: 2 số nguyên a và b
	// Chức năng: tính tổng (input: a và b -- output: tổng của a và b)
	public static void main(String[] args) {
		System.out.println("Welcome to class");
		int value = sum(5, 10);
		System.out.println("Result: " + value);
	}

	// Khai báo hàm, chức năng
	public static int sum(int a, int b) {
		return a + b;
	}
}
