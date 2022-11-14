package control;

public class Ex04LoopWhile {

	public static void main(String[] args) {
		//in ra những phần tử nhỏ hơn n
		int n = 12;
		
		//B1: nếu BTĐK == true ==> thực hiện phần body
		//				  false ==> thoát khỏi while
		//B2: quay lại B1
		int i = 0;
		while (i < n) {
			System.out.print(i++ + " ");
		}
		
		System.out.println("\n========================");
		
		i = 0;
		while (true) {
			System.out.print(i++ + " ");
			if(i==n) {
				break;
			}
			
		}
		System.out.println("\nFinish...");

	}

}
