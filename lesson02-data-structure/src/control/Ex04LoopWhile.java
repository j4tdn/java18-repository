package control;
/**
 * while
 * do while
 *
 */
public class Ex04LoopWhile {
	public static void main(String[] args) {
		// in ra những phần tử nhỏ hơn N
		int n = 12;
		
		// --> sử dụng while 
		// b1: Nếu biểu thức điều kiện == true ==> thực hiện body
		//                                false ==> thoát khỏi while
		// b2: quay lại bước 1
		int i = 0;
		while (i < n) {
			// body
			System.out.print(i + " ");
			i++ ;
		}
		
		System.out.println("\n=============");
		
		i = 0;
		while(true) {
			// body
			System.out.print(i + " ");
			i ++;
			
			// điều kiện dừng --> để thoát khỏi while
			if (i == n) {
				// khi trong vòng while gặp từ khóa break thì nó sẽ thoát
				// khỏi while
				break;
			}
		}
		
		System.out.println("\nFinished ...");
	}
}
