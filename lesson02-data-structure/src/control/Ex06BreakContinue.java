package control;
/**
 * Khi đang duyệt vòng lặp thứ i trong n vòng lặp
 * Nếu gặp break thoát khỏi for
 * gặp continue kết thúc sớm vòng lặp hiện tại ( và nhảy qua biểu thức khác)
 * 
 *
 */
public class Ex06BreakContinue {
	public static void main(String[] args) {
		int n=10;
		for(int i=1 ; i<=n;i++) {
			System.out.println("--------start body");
			System.out.println(i);
			if(i==5) {
				//break;
				
				continue;
			}
			System.out.println("end body ----------");
		}
	}

}
