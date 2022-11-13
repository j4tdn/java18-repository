package control;

/**
 * Khi đang duyệt vòng lặp thứ i trong n vòng lặp. Nếu gặp
 * --> break --> thoát khỏi for
 * --> continue --> thoát khỏi vòng lặp hiện tại(và nhảy qua BT3)
 *              --> kết thúc sớm vòng lặp hiện tại
 */
public class Ex06BreakContinue {
	public static void main(String[] args) {
		int n = 10;
		
		for (int i = 1; i <= n; i++) {
			System.out.println("----> start body");
			if (i == 5) {
				// break;
				continue;
			}
			System.out.println(i);
			System.out.println("end body <<<----");
		}
	}
}
