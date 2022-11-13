package control;

public class Ex04LoopDoWhile {
	public static void main(String[] args) {
		int n=12;
		//-->using while
		//nếu BTDK == true ==> thực hiện phần body==>B2
		//            false==> thoát khỏi while
		//B2. quay lại B1
		int i=0;
		while(i<n) {
			System.out.print(i + " ");
			i++;
			
		}
		System.out.println("\n hehe");
		 i=0;
		 while(true) {
			System.out.print(i+" ");
			i++;
			if(i==n) {
				break;
			}
		 }
		
	}

}
