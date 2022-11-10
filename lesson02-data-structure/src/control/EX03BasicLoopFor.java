package control;

/*
 * loop:
 * - for(index, each)
 * - while
 * - do while
 * - iterate(dung sau)
 */
public class EX03BasicLoopFor {
	public static void main(String[] args) {
//		in ra danh sach cac so nguyen nho hon N
//		voi n nhap tu ban phim hoac khai bao san
//		
		int n = 12;
//		for(BT1; BT2; BT3)
//		BT1: bt khai bao --> goi duy nhat lan dau khi vao for
//		BT2: bt dieu kien(true false)
//		--> body van chay khi bieu thuc 2 true
//		BT3: bt dieu khien (tang giam)
		
		for(int i=0; i < 100; i++) {
//			BODY of loop
			if(i%12==0) {
			System.out.print(i + " ");
			}
		}
	}

}
