package control;

/**
 * while
 * do_while
 * @author ASUS
 *
 */
public class Ex04BasicLoopWhile {
	public static void main(String[] args) {
		//In ra những phần tửu nhỏ hơn n
		int n = 12;
		
		// Nếu BTĐK == true thực hiện body, ==fale => OUT;
		int i = 0;
		while(i< n) {
			//body
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println("\nFinished...");
		
		System.out.println("\n======================================");
		
		i = 0;
		while(true) {
			System.out.print(i + " ");
			i++;
			
			//ĐK dừng
			if( i == n) {
				break;
			}
		}
		
		System.out.println("\nFinished...");
	}
}
