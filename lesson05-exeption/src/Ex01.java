import java.util.Scanner;

/*
 * Giải phương trình bậc nhất ax + b = 0. Các hệ số nhập vào từ bàn phím. Sử dụng Try-Catch
 * để bẫy các lỗi xảy ra khi nhập sai kiểu dữ liệu:
 * - Ví dụ nhập số nhưng nhập chữ
 * - Bẫy lỗi chia cho 0
 * 
 */

public class Ex01 {
	public static void main(String[] args) {
		
		double a, b;
		
		System.out.println("### ax+b = 0 ###");
		do {
			System.out.println("Enter a: ");
			a = getNumber();
			System.out.println("Enter b: ");
			b = getNumber();
			try {
				System.out.println("X --> " + (-(doDivide(b,a))));
			} catch (NumberFormatException | ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			
			break;
			
		}while(true);
		
	}
	private static double getNumber() {
		String inputInString = null;
		double result = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				inputInString = sc.nextLine();
				result = Double.parseDouble(inputInString);
				break;
				
			} catch(NumberFormatException e) {
				System.out.println("Given input is invalid!");
			}
		} while(true);
		return result;
	}
	private static double doDivide(double above, double below) {
		if (below == 0) {
			throw new ArithmeticException("a must not be zero!");
		}
		return above/below;
		
	}
}
