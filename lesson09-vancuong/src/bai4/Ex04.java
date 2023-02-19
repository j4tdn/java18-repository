package bai4;

public class Ex04 {
	public static void main(String[] args) {
		String[] arrays = new String[] { "x", "y", "z" };
		Ex04 p = new Ex04();
		p.getPermutation(arrays);
	}

	public void getPermutation(String[] arrays) {
		printPermutation(arrays, 0, true);
	}

	private void printPermutation(String[] arrays, int start, boolean display) {
		if (display) {
			System.out.print(",");
			for (int i = 0; i < arrays.length; i++) {
				System.out.print(arrays[i] + " ");
			}
		}

		for (int j = start; j < arrays.length; j++) {
			String temp = arrays[start];
			arrays[start] = arrays[j];
			arrays[j] = temp;
			if (j == start) {
				printPermutation(arrays, start + 1, false);
			} else {
				printPermutation(arrays, start + 1, true);
			}
			temp = arrays[start];
			arrays[start] = arrays[j];
			arrays[j] = temp;
		}
	}
}
