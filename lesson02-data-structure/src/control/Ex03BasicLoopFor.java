package control;

// khi comment 1 dòng dùng //
// khi comment trong 1 hàm có nhiều dòng /* enter */
// khi coment để giải thích cho 1 hàm, 1 class thì dùng /** enter **/

/**
 * Loop: + for(index/each) + while + do while --> iterate ( collection )
 */
public class Ex03BasicLoopFor {

	public static void main(String[] args) {
		// In ra danh sách các số nguyên dương nhỏ hơn N
		// Với N: nhập từ bàn phím, hoặc khai báo sẵn

		int n = 12;
		// BT1: biểu thức khai báo -> gọi duy nhất lần đàu khi vào vòng for
		// BT2: biểu thức điều kiện(true false)
		// --> body(vòng lặp) vẫn chạy ( thực hiện khi biểu thức 2 vẫn đang true)
		// BT3: biểu thức điều khiển

		// phần tử nhỏ hơn 12
		// phần tử chẵn nhỏ hơn 12
		// phần tử lẽ nhỏ hơn 12
		// phần tử là bội của 5 và nhỏ hơn 12
		// bội của 3 và 4 và nhỏ hơn 100 ( chia hết cho 12 )
		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}

	}

}
