package view;

public class Ex09 {
	public static void main(String[] args) {

		////---- sai
		int i = 0, n = 2; // 2 la so nguyen to thu 1
		while (i < 200) {
			for (int j = 2; j < n; j++) {
				if (n % j == 0) {
					break;
				}

				i++;
			}
			n++;

		}
		System.out.println(n);
	}

}
