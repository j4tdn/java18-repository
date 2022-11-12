package control;


/**
 * Loop
 * + for (index/each)
 * + while
 * + do while
 * --> iterate (collection)
 *
 */
public class Ex03BasicLoopFor {
	public static void main(String[] args) {
		// in ra danh sách các số nguyên nhỏ hơn N(N nhập từ bàn phím )
		// với N: nhập từ bàn phím or khai báo sẵn
		
		int n = 100;
		//BT1: biểu thức khai báo --> gọi duy nhất lần đầu khi vào for
		//BT2: biểu thức điều kiện(true/ false)
		// --> body (vòng lặp) vẫn chạy khi (thực hiện) khi BT2 vẫn đang true
		//BT3: biểu thứ điều khiển
		
		
		for(int i = 0; i < n; i += 12) {
			//body
			System.out.print(i + " ");
		}
	}

}
