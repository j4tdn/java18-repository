package control;
/**
 * Khi đang duyệt vòng lặp thứ i trong n vòng lặp.Nếu gặp
 * -->break : thoát khỏi vòng lặp
 * -->continue: thoát khỏi vòng lặp hiện tại(và nhảy qua BT3)
 *                kết thúc vòng lặp hiện tại
 *
 */

public class Ex06BreakContinue {
             public static void main(String[] args) {
				int n=10;
				for(int i=0;i<n;i++) {
					System.out.println("----> start body");
					if (i==5) {
						//break
						continue;
					}
					System.out.println(i);
					System.out.println("end body <<<------");
				}
			}
}
