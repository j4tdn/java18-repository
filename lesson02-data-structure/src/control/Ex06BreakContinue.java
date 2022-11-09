package control;

/**
 * Khi đang duyệt vòng lặp thứ i trong n vòng lặp, Nếu gặp
 * --> break --> thoát khỏi for
 * --> continue --> thoát khỏi vòng lặp hiện tại ( nhảy ra BT 3 ) / Kết thúc sớm vòng lặp hiện tại
 * @author PC
 *
 */

public class Ex06BreakContinue {
	public static void main(String[] args) {
		int n = 10;
		for(int i = 0; i < n; i++) {
			System.out.println("---> start body");
			if(i == 5) {
				continue;
			}
			System.out.println(i);
			System.out.println("end body <---");
		}
	}
}
