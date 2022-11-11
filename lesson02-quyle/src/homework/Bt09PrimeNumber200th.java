package homework;

public class Bt09PrimeNumber200th {
	public static void main(String[] args) {
		int i=2;
		int dem=0;
		while(true) {
			if(i==2) {
				dem++;
			}
			i++;
			if(KTsonguyento(i)) {
				dem++;
			}
			if(dem==200) {
				break;
			}
		}
		System.out.println(i);
	}
	private static boolean KTsonguyento(int a) {
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				return false;
			}
			if(i==a-1) {
				return true;
			}
		}
		return false;
	}
}
