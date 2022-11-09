package control;

/**
 * Loop
 * + for(Index/each)
 * + while
 * + do while
 * + iterate(collection)
 * 
 *  
 */

public class Ex03BasicLoop {
	public static void main(String[] args) {
		// in ra danh sach cac so nguyen nho hon N
		//Voi N: nhap tu ban phim hoac khai bao san
		// BT1: bieu thuc khai bao --> goi duy nhat lan dau khi vao for
		// BT2: bieu thuc dieu kien (true/false)
		// --> body (vong lap) van chay(thuc hien) khi BT2 vsn dang true
		// BT3: bieu thuc dieu khien
		int n = 12;
		
		for(int i =0; i <= n; i++) {
			if(i % 12 == 0) {
				System.out.println(i);
			}
			
		}
	}

}
