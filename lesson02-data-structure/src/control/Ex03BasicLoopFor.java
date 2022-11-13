package control;

public class Ex03BasicLoopFor {
	public static void main(String[] args) {
		// IN ra danh sách các số nguyên nhỏ hơn N
		// với N : nhập từ bàn phím hoặc khai báo sẵn

		/**
		 * Loop + for ( indexx/each) + while + do while + --> iterate( collection )
		 */

		int n = 12;
		// BT1: Biểu thức khai báo --> gọi duy nhất lần đầu khi vào for
		// BT2: Biểu thức điều kiện(true false)
		// --> body ( vòng lặp) vẫn chạy ( thực hiện ) khi BT2 vẫn đang true
		// BT3: Biểu thức điều kiện

		// Phân tử nhỏ hơn 12 ---> 0,1,2,.,.,11
		// Phân tử chẵn nhỏ hơn 12 ---> 0 2 4 6 8 10
		// Phân tử lẽ nhỏ hơn 12 ---> 1 3 5 7 9 11
		// Phân tử ;à bội của 5 và nhỏ hơn 12 ---> 0 5 10
		// BỘi của 3 và 4 nhỏ hơn 100

		for (int i = 0; i < n; i++) {
			// body
			if (i % 12 == 0) {
				System.out.println(i + "  ");
			}
		}

	}

}
