package Control;

/**
 * 
 * 
 *
 */
public class Ex04LoopWhile {
	public static void main(String[] args) {
		// In ra những phần tử nhỏ hơn N
		int n = 12;
		// --> Sử dụng while
		// B1. Nếu biểu thức điều kiện == true ==> thực hiện phần body
		//								  fale ==> thoát khỏi while
		// B2. Quay lại B1
		int i = 0;
		while(i < n) {
			// body
			System.out.print(i + " ");
			i++;
		}
		System.out.println("\n================");
		
		i = 0;
		while(true) {
			//body
			System.out.print(i + " ");
			i++;
			
			// điều kiện dừng --> để thoát khỏi vòng while
			if (i == n) {
				// khi trong vong while gặp từ khóa break thì nó sẽ thoát
				// khỏi while
				break;
			}
		}
		
		System.out.println("\nFinished....");
	}

}
