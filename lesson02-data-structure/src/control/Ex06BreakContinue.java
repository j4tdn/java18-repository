package control;

public class Ex06BreakContinue {
	public static void main(String[] args) {
		int n = 10;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(" ---> start body ");
			if (i ==5) {
				continue;
			}
			System.out.println(i);
			System.out.println("end body <<<----");
		}
	}
}
