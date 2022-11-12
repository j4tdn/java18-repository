package control;

/**
 * while do_while
 *
 */
public class Ex04LoopWhile {
	public static void main(String[] args) {
		int n = 12;

		// B1. nếu BTĐK == true ==> thực hiện phần body ==> B2
		// fase ==> thoát khỏi while
		// B2. quay lại B1

		int i = 0;
		while (i < n) {
			// body
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println("\n===========");
		
		i = 0;
		while (true) {
			System.out.print(i + " ");
			i++;
			
			//điều kiện dừng --> thát khỏi while
			if (i == n) {
				//khi trong while gặp từ khóa break thì sẽ thoát khỏi while
				break;
			}
		}
		
		//System.out.println("\nFinished.......");
	}

}
