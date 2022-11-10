package control;

/**
 * Loop
 * + for(index/each)
 * + while
 * do while
 * --> iterate (collection)
 * @author Administrator
 *
 */

public class Ex03BasicLoopFor {
	public static void main(String[] args) {
		// In ra danh sach cac so nguyen duong nho hon N
		// Voi N: nhap tu ban phim hoac khai bao san
		// Bieu thuc khai bao
		// Bieu thuc dieu kien
		// Bieu thuc dieu khien
		
		int n = 100;
		
		for(int i = 0; i < n; i++) {
			// body
			if(i % 12 == 0) {
				System.out.println(i + " ");
			}
		}
	}
}

