package control;
/**
 * Loop
 * + for(index/each)
 * + while
 * + do while
 * + iterate (collection)
 */
public class Ex03BasicLoopFor {
	public static void main(String[] args) {
		// In ra danh sách các số nguyên dương nhỏ hơn N
		// Với N: nhập từ bàn phím hoặc khai báo sẵn
		
		int n = 12;
		
		// BT1: Biểu thức khai báo  --> gọi duy nhất lần đầu khi vào "for"
		// BT2: Biểu thức điều kiện (true/false)
		//      --> body (vòng lặp) vẫn chạy (thực hiện) khi BT2 vẫn đang true 
		// BT3: Biểu thức điều khiển
		
		// Phần tử nhỏ hơn 12 						--> i = 0, i < n, i++
		// Phần tử chẵn nhỏ hơn 12					--> i+=2
		// Phần tử lẻ nhỏ hơn 12					--> i = 1, i < n, i+=2
		// Phần tử là bội của 5 và nhỏ hơn 12		--> i+=5
		// Phần tử là bội của 3 và 4 và nhỏ hơn 100 --> i+=12
		
		for (int i = 0; i < n; i++) {
			System.out.print(i + " ");
		}

	}

}
