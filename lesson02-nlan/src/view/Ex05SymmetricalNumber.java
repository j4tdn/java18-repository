package view;

/*Viết chương trình kiểu tra N có phải là số đối xứng hay không
Biết rằng N được nhập từ bàn phím là một số nguyên dương có tối thiểu 2 chữ số
VD: Nhập N = abc -> báo lỗi, yêu cầu nhập lại
			= a123 -> báo lỗi, yêu cầu nhập lại
			= 1 -> báo lỗi, yêu cầu nhập lại
			= 256 -> false
			= 1252 -> true
			= 2662 -> true
			*/

public class Ex05SymmetricalNumber {
	public static void main(String[] args) {
		int number = 15651;

		System.out.println(number + " is symectric --> " + isSymetric(number));
	}

	private static boolean isSymetric(int number) {
		return number == reverse(number);
	}

	private static int reverse(int number) {
		int reverse = 0; 
		while(number != 0) {
			reverse = reverse * 10 + number % 10;
			number /= 10;
		}
		return reverse;
	}
}

