package kf.bai1;

public class Bai1Demo {
	public static void main(String[] args) {
		System.out.println(isPower(8, 2));
		System.out.println(isPower(2, 8));
		System.out.println(isPower(6, 2));
		System.out.println(isPower(20, 4));
		System.out.println(isPower(64, 4));
		System.out.println(isPower(4, 4));
	}
	public static boolean isPower(int a,int b) {
		int result = 0;
		if(a>b) {
			for(int i = 1;i<a/2;i++) {
				result+=b*b;
				if(result== a) {
					return true;
				}
			}
		}
		else if (a<b) {
			for(int i = 1;i<b/2;i++) {
				result+=a*a;
				if(result == b) {
					return true;
				}
			}
		}
		else if(a==b) {
			return true;
		}
		return false;
	}
}
