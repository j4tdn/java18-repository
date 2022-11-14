package control;

public class Ex06BreakContinue {

	/**
	 * Khi đang duyệt vòng lặp thứ i trong n vòng lặp. nếu gặp
	 * --> break --> thoát khỏi for
	 * --> continue --> thoát khỏi vòng lặp hiện tại
	 */
	
	public static void main(String[] args) {
		int n = 10;
		
		for(int i = 1; i <= n; i++) {
			System.out.println("---->start");
			if(i == 5) {
				//break;
				continue;
			}
			System.out.println(i);
			System.out.println("end body <<<-----");
		}
	}

}
