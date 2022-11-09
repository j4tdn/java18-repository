package control;

public class Ex04LoopWhile {
	public static void main(String[] args) {
		int n = 12;

		// --> sử dụng while
		// nếu biểu thức điều kiện == true ==> thực hiện phàn body ==> b2
		// == false ==> thoát khỏi while
		// quay lại bước 1

		int i = 0;
		while (i < n) {
			System.out.print(i + " ");
			i++;

		}

		System.out.println("\n============");

		i = 0;

		while (true) {
			// body
			System.out.print(i + " ");
			i++;

			// điều kiện dừng --> để thoát khỏi while
			if (i == n) {
				break;
			}

		}
		// System.out.println();

	}

}
