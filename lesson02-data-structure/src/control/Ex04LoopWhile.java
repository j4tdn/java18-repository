package control;

public class Ex04LoopWhile {
	public static void main(String[] args) {
		// In ra những phần tử nhỏ hơn N
		
		int n = 12;
		// -- sử dụng while
		// B1. Nếu BTĐK == true ==> Thực hiện phần body
		// 		else thoát khỏi while
		// B2. Quay lại B1
		int i = 0;
		
		while(i < n) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println("\n=====================");
		
		i = 0;
		while(true) {
			System.out.print(i + " ");
			i++;
			if(i == 12) {
				break;
			}
		}
		
		System.out.println("\nFinished ...");
	}
}
