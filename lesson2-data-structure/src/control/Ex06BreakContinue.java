package control;
/**
 * Khi đang duyệt vòng lặp thứ i trong n vòng lặp . Nếu gặp
 * ---> break --> thoát khỏi for
 * ---> continue --> thoát khỏi vòng lặp hiện tại( và nhảY qua BT3)
 *               --> KẾT THỨC SỚM VÒNG LẶP HIỆN TẠI
 * 
 */
public class Ex06BreakContinue {
	public static void main(String[] args) {
		int n = 10;
		
		for (int i = 1; i<= n; i++) {
			System.out.println("--> start body");
			if(i == 5) {
				//break;
				continue;
			}
			System.out.println(i);
			System.out.println("end body <<--");
		}
	}

}
