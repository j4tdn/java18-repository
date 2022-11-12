package control;

public class Ex04LoopWhile {
	public static void main(String[] args) {
		int n = 12;
		int i = 0;
		while (i < n) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println("\n===============================");
		 i = 0;
		while (true) {

			System.out.print(i + " ");
			i++;
			if (i == n) {
				break;
			}
		}
		System.out.println("\nFinished...");
	}
}
