package control;

/**
 * Loop
 * + for(index/each)
 * + while
 * + do while
 * + iterate(collection)
 * 
 *
 */
public class Ex03BasicLoopFor {

	public static void main(String[] args) {
		//In ra danh sách các số nguyên nhỏ hơn N(nhập từ bàn phím hoặc cho sẵn)
		//BT1: biểu thức khai báo --> gọi duy nhất lần đầu khi vào for
		//BT2: biểu thức điều kiện(true false)
		//--> body(vòng lặp) vẫn chạy(thực hiện) khi BT2 vẫn đang true
		//BT3: biểu thức điều kiện
		
		//Phần tử nhỏ hơn 12
		//Phần tử chẵn nhỏ hơn 12
		//Phần tử lẻ nhỏ hơn 12
		//Phần tử là bội của 5 và nhỏ hơn 12
		//Phần tử là bội của 3 và 4 và nhỏ hơn 100
		
		int n = 100;
		for(int i = 1; i < n; i+=2) {
			if(i % 12  == 0){
				System.out.println(i + " ");
			}
		}

	}

}
