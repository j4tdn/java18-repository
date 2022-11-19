package control;

/**
 * Loop
 * + for(index/each)
 * + while
 * + do while
 * + --> iterate(collection)
 * @author Admin
 *
 */
public class Ex03BasicLoopFor {
	public static void main(String[] args) {
		// In ra danh sách các số nguyên N
		// VớiN: nhập từ bàn phím hoặc khai báo sẵn
		
		int n = 12;
		
		//BT1: biểu thức khai báo --> gọi duy nhất lần đầu khi vào for
		//BT2: biểu thức điều kiện(true/false)
		// --> body(vòng lặp) vẫn chạy khi BT2 vẫn đang là true
		//BT3: biểu thức điều khiển
		
		// Phần từ nhỏ hơn 12 --> 0,1,2,3,...11
		// Phần tử chẵn nhỏ hơn  12  ---- for(int i = 0; i < n; i+=2) (0,2,4,6,8,10)
		// Phần tử  lẻ  nhỏ hơn  12  ---- for(int i = 1; i < n; i+=2) (1,3,5,7,9,11)
		// Phần tử là bội của 5 và nhỏ hơn 12 --- for(int i = 0; i < n; i+=5)  (0,5,10)
		// Phần tử là bội của 3 và 4 nhỏ hơn 100 --- for(int i = 0; i < n; i+=12)
		for(int i = 0; i < n; i++) {
			// trong BLOCK SCOPE này là body
			System.out.println(i + " ");
		}
	}
}
