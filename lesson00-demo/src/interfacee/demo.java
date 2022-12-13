package interfacee;

public class demo {
	public static void main(String[] args) {
		bai1 b1 = new bai1() {
			
			@Override
			public boolean test(int a) {
				return a%2==0;
			}
		};
		System.out.println("test ----> " + b1.test(12));
		bai1 b2 = new testeven();
		System.out.println("test ----> " + b2.test(15));
		
		bai1 b3 = (int a) -> {
			return a%4==0;
		};
		System.out.println("test ----> " + b3.test(12));
	}
}
