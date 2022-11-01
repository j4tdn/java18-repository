package operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int x = 5;
		x -= 2 + 5;
		System.out.println("x -= : " + x); // -2

		int y = 7;

		y = y + x;
		y += 2;
		System.out.println("x --> " + x);

		x = 1;
		y = 2;
		int z = 3;

		y -= ++x + --y + z++ - --z + x++;

		System.out.println("\n==========\n");
		System.out.println("Resulf of x: " + x);
		System.out.println("Resulf of y: " + y);
		System.out.println("Resulf of z: " + z);

	}
}
