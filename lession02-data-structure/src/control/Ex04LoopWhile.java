package control;
/**
 * while
 * do_while
 */
public class Ex04LoopWhile {
	public static void main(String[] args) {
		// In ra nhung phan tu nho hon N
		int n = 12;
		
		// --> su dung while
		int i = 0;
		while(i < n) {
			// body
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println("\n ===================");
		
		i = 0;
		
		while(true) {
			// body
			System.out.print(i + " ");
			i++;
			if(i == 12) {
				break;
			}
		}
		
		System.out.println("\nFinished.");
	}
}
