package control;

/**
 * 
 * *while do while
 */
public class Ex04LoopWhile {
	public static void main(String[] args) {
		// In ra những phần tử nhỏ hơn N
		int n = 12;

		// Sử dụng while
		// B1 : Nếu biểu thức điều kiện mà đang == trure ==> thực hiện phần body ==>B2
		//                                      == false ==> thoát khỏi while
		// B2 : Quay lại B1

		int i = 0;
		while (i < n) {
			// body
			System.out.print(i + " ");
			i++;
		}

		System.out.println("\n=============");
		i = 0;
		while (true) {
			System.out.print(i + " ");
			i++;

			// Điều kiện dừng --> thoát khỏi while
			if (i == n) {
			   // Khi trong vòng while gặp từ khóa break thì nó sẽ thoát khỏi while
				
				break;
			}

		}

		//System.out.println("\nFinished ....");
	}
}
