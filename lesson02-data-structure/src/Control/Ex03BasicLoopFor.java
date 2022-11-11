package Control;

/**
 * Loop
 * + for(index/each)
 * + While
 * + do while
 * --> iteate(collection)
 * @author Ngoc Lan
 *
 */
public class Ex03BasicLoopFor {
	public static void main(String[] args) {
		// In ra danh sách các số nguyên nhỏ hơn N
		// với N: nhập từ bàn phím hoặc khai báo sẵn
		
		int n = 12;
		// BT1: Biểu thức khai báo --> gọi duy nhất lần đầu khi vào for
		// BT2: Biểu thức điều kiện(true false)
		// --> body(vòng lặp) vẫn chạy khi BT2 vẫn đang true
		// BT3: biểu thức điều khiển
		
		for(int i = 0; i < n; i++) {
			// body
			if (i % 12 == 0) {
			}
			System.out.println(i + " ");
		}
	}
}
