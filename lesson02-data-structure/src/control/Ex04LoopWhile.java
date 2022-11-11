package control;

/**
 * 
 * while do_while
 *
 */
public class Ex04LoopWhile {

	public static void main(String[] args) {
		// in ra những phần tử nhỏ hơn N
		int n = 12;

		// -> sử dụng while
		// B1: nếu biểu thức điều kiện == true ==> thực hiện phần body ==> B2
		// == false ==> thoát khỏi while
		// B2: Quay lại B1
		int i = 0;
		while (i < n) {
			// body
			System.out.print(i + " ");
			i++;
		}

		// println: in kết quả mới xuống dòng

		System.out.println("\n=========================");

		i = 0;
		while (true) {
			System.out.print(i + " ");
			i++;

			// điều kiện dừng -> để thoát khoier while
			if (i == n) {
				// khi trong vòng while gặp từ khóa break thì nó sẽ thoát khỏi while
				break;
			}
		}

		// in xong mới xuống hàng
		System.out.println("\nFinished...");
	}

}
