package control;

/**
 * Loop
 * + for(index/foreach)
 * + while
 * + do while
 * + --> iterate(collection)
 * @author PC
 *
 */

public class Ex03BasicLoopFor {
	public static void main(String[] args) {
		int n = 12;
		// Bt1 : biểu thức khai báo --> Gọi duy nhất lần đầu khi vào for
		// Bt2 : biểu thức điều kiện ( true / false)
		// --> body (vòng lặp) vẫn chạy ( thực hiện ) khi BT2 vẫn đang true
		// Bt3 : biểu thức điều khiển
		for(int i = 0; i < n; i++) {
			System.out.println(i + " ");
		}
	}
}
