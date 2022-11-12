package control;

/**
 * Loop
 * + for(index/each)
 * + while
 * + do while
 * --> iterate(collection)
 */

public class Ex03BasicLoopfor {
	public static void main(String[] args) {
		// In ra danh sách so nguyen nho hơn n;
		// Với N: Nhập từ bàn phim hoặc khai báo sẵn;
		
		int n = 100;
		//BT1: biểu thức khai báo --> gọi duy nhất lần đầu khi vào for
		//BT2: biểu thức điều kiện (true false)
		// ==> body(vòng lặp) vẫn chạy ( thực hiện) khi BT2 vẫn đang true
		
		//Boi của 3 và 4 < 100
		for(int i = 0; i< n; i++) {
			//body
			if( i % 12 == 0)
			System.out.println(i + " ");
		}
	}

}
