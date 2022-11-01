package operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int x = 5;
		x -= 2 + 5;
		// x = x - 7 ==> -2
		// x = x - 2 + 5 ==> 8
		System.out.println("xxxxxx ->>>>> " + x); // -2
		int y = 7;
		y = y + x;
		y += 2;
		System.out.println("y = " + y);
		x = 1;
		y = 2;
		int z = 3;
		
		System.out.println(" KQ x = " + x);
		System.out.println(" KQ y = " + y);
		System.out.println(" KQ z = " + z);
	}
}
