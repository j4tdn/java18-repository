package operator;

public class Ex02ComparingOperator {
	public static void main(String[] args) {
		// so sánh == <= >= !=

		int a = 15;
		int b = 22;
		int c = 18;

		// expressiom: a. b --> biểu thức điều kiện
		System.out.println("test ==> " + (a > b));
		boolean isGreater = b > c;
		System.out.println("isGreater: " + isGreater);

		// Kiểm tra 1 số là chẵn hay lẽ
		// yêu cầu : kiểm tra 1 số chẵn hay lẻ
		// 'nếu' chẵn ==> in ra giá trị đó
		// 'nếu' lẽ ==> in ra giá trị đó + 1

		c = 20;
		boolean isEven = c % 2 == 0;
		// if(condition expession){} hàm trur false
		//if (isEven == true) <==> if(isEven)
		if (c % 2 == 0) {
			System.out.println("c ==> " + c);
		}
		
		//if (isEven ==false) <==> if (!isEven)
		if (c % 2 != 0) {
			System.out.println("(c+1) ==> " + (c + 1));
		}

	}
}
