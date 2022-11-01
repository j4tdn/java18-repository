package operator;

public class Ex02ComparingOperator {
	public static void main(String[] args) {
		int a = 20;
		int b = 15;
		
		isEven(a);
		isEven(b);
		
	}
	public static void isEven(int number) {
		if(number % 2 == 0) {
			System.out.println("là số chẵn");
		}else {
			System.out.println("là số lẻ");
		}
	}
	
}
