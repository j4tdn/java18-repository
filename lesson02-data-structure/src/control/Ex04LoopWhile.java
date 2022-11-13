package control;

/**
 * 
 * while do_while
 *
 */
public class Ex04LoopWhile {
	public static void main(String[] args) {
		int n = 12,i=1;
		//---> dùng while
		// đúng điều kiện thì thực hiện 
		// quay lại bước 1
		// nếu ko đúng điều kiện thoát khỏi while
		while(i<12) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println("\n====================");
		
		i=1;
		while(true) {
			System.out.print(i + " ");
			i++;
			if(i==n) {
				break;
			}
		}
		
		
	}
}
