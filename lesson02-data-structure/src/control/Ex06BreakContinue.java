package control;

/**
 * Để xóa 1 dòng : Ctrl D
 * Khi đang duyệt vòng lặp thứ i trong n vòng lặp. Nếu gặp 
 * --> break --> thoát khỏi for
 * --> contunie --> thoát khỏi vòng lặp hiện tại(và nhảy qua vòng lặp biểu thức 3)
 *              --> kết thúc sớm vòng lặp hiện tại
 *
 */
public class Ex06BreakContinue {
	public static void main(String[] args) {
		int n = 10;
		
		for (int i = 1 ; i <= n; i++) {
			System.out.print("Start body");
			if (i == 5) {
				// break;
				continue;
			}
			System.out.println(i);
			System.out.println("End body");
		}
	}
}
