package ExLesson02;

public class Ex09 {
	public static void main(String[] args) {
		int n = 1, i = 0;
		while (i < 200) {
			n++ ;
			if (Ex08.isPrime(n)) {
				i++;
			}
		}
		System.out.println("Prime is number 200: " + n);
	}
}
