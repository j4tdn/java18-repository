package control;
/**
 * Loop
 * +for(index/each)
 * +while
 * +do while
 * +iterace(collection)
 *
 */
public class Ex03BasicLoop {
	public static void main(String[] args) {
		// In ra danh sách các số nguyên dương nhỏ hơn N
		//với N: nhập từ bàn phím hoặc khai báo sẵn
		int n=12;
		//BT1:biểu thức khai báo-->gọi duy nhất lần đầu khi vào for
		//BT2:biểu thức điều kiện(true false)
		//--> body(vòng lặp)vẫn chạy(thực hiện)khi biểu thức 2 vẫn đang là true
		//BT3:biểu thức điều khiển
		for(int i=0;i<n;i++) {
		//body
			System.out.print(i + " ");
		}
	}

}
