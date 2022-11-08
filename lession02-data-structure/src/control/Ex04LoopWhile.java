package control;

/**
 * while
 * do_while
 *
 */

public class Ex04LoopWhile {
	public static void main(String[] args) {
		// In ra những phần tử nhỏ hơn N
		int n = 12;
		
		// --> sử dụng while
		// B1. Nếu BTDK == true  ==> thực hiện phân body ==> B2
		//				   false ==> thoát khỏi while
		// Quay lại bước 2
		int i = 0;
		while(i<n) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println("\n==========================");
		
		i = 0;
		while(true) {
			
			System.out.print(i + " ");
			i++;
			if(i == n)
				break;
		}
		System.out.println("\nFinished ...");
	}
}
