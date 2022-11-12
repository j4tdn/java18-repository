package control;

public class Ex06BreakContinue {
	public static void main(String[] args) {
		int n = 10;
		for(int i = 1; i < n; i++) {
			System.out.println("Start body ==>");
			if(i == 5 ) {
				continue;
			}
			System.out.println(i);
			System.out.println("<== End body");
		}
	}

}
