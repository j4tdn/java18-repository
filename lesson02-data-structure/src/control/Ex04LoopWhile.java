package control;

/**
 * while
 * do_while
 */

public class Ex04LoopWhile {
	public static void main(String[] args) {
		// In ra những phần tử nhỏ hơn n
		int n = 12;
		
		// --> sử dụng while
		// B1: Nếu BTĐK == true  ==> thực hiện phần Body ==> B2
		//              == false ==> thoát khỏi while 
		// B2: Quay lại B1
		
		int i = 0;
		while (i < n) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println("\n=========================");
		
		i = 0;
		while (true) {
			System.out.print(i + " ");
			i++;
			
			// điều kiện dừng --> để thoát khỏi while
			if (i == n) {
				// khi trong vòng while gặp từ khóa break --> thoát khỏi while
				break;
			}
		}

		System.out.println("\nFinished...");

	}

}
