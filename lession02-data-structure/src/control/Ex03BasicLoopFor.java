package control;

/*
 * Loop
 *  +for('index'/each)
 *  +while
 *  +do while
 *  -->iterate(collection)
 */

public class Ex03BasicLoopFor {
	public static void main(String[] args) {
		// In ra danh sách các số nguyên dương nhỏ hơn N
		// Với N: nhập từ bàn phím hoặc khai báo sẵn
		
		int n = 12;
		// BT1: biểu thức khai báo --> gọi duy nhất lần đầu khi vào for
		// BT2: biểu thức điều kiện(true false)
		// --> body(vòng lặp) vẫn chạy(thực hiện) khi BT2 vẫn đang true
		// Phần tử nhỏ hơn 12		--> 0,1,...,11
		// Phần tử chẵn nhỏ hơn 12	--> 0,2,...,10
		// Phần từ lẻ là bội nhpr hơn 12 --> 1,3,5,7,9,11
		// Phần tử là bội của 3 và 4
		
		for(int i = 0; i < n; i++) {
			// body
			System.out.print(i + " ");
		}
	}
}
