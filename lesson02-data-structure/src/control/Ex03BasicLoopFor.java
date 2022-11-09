package control;

/**
 * Loop
 * + for(index/each)
 * + while
 * + do while
 * --> iterate(collection)
 *
 */

public class Ex03BasicLoopFor {
	public static void main(String[] args) {
		// in ra danh sách các số nguyên nhỏ hơn N
		//với N: nhập từ bàn phím hoặc hai báo sẵn
		
		int n = 12;
		//BT1: biểu thức khai báo  --> gọi duy nhất lần  đầu khi vào for
		//BT2: biểu thức điều kiện(true false)
		// -->body(vòng lặp) vẫn chạy(thực hiện)khi BT2 vẫn đang true

		for (int i = 0; i < n; i++) {
			if (i% 12 ==0) {
				System.out.print(i+"  ");
			}
		}
	}

}
