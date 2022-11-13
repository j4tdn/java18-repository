package control;

/**
 * Loop (vong lap)
 * + for (index/each)
 * + while
 * + do while
 * + iterate (collection)
 * @author DELL
 *
 */
public class Ex03BasicLoopFor {
	public static void main(String[] args) {
		// in ra danh sách các số nguyên dương nhỏ hơn N 
		// Với N nhập từ bàn phím hoặc khai báo sẵn
		
		int n = 12;
		// biểu thức 1: biểu thức khai báo --> gọi duy nhất lần đầu khi vào for
		// BT 2: Biểu thức điều kiện --> trả về true/ false
		// --> body (vòng lặp) vẫn chạy (thực hiện) khi BT2 vẫn đang true
		// BT3: biểu thức điều khiển 
		
		// phần tử nhỏ hơn 12 --> 0,1,2,...,11
		// phần tử chẵn nhỏ hơn 12 --> 0,2,4,..
		//   ==> i+=2
		// Phần tử lẽ nhỏ hơn 12 --> 1 3 5..
		//   ==> int i = 1 && i+=2
		// Phần tử là bội của 5 và nhỏ hơn 12 --> 0 5 10
		//   ==> i +=5 
		// bội của 3 và 4 và nhỏ hơn 100
		//   ==> i += 12 hoặc if (i % 12 == 0)
		for (int i = 0; i < n ; i++) {
			// body
			System.out.println(i + " ");
		}
	}
}
