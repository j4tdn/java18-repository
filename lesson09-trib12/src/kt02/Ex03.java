package kt02;

public class Ex03 {
	public static void main(String[] args) {
		int [] A = {8, 5, 9, 20};
		for (int i=0; i<A.length; i++) {
			System.out.println(div(A[i]));
		}
		
		
		
	}
	private static int div(int a) {
		int level =0;
		for(int i=1; i<=a; i++) {
			if(a%i == 0) {
				level++;
			}
		}
		return level;
	}

}
