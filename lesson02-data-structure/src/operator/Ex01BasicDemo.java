package operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {

		int x = 5;
		x -= 2 + 5;
		System.out.println("xxxxxxx ->>>>" + x);
		int y = 7;
		y = y + x;
		y += 2;
		System.out.println("x -->" + x);

		x = 5;
		y = 8;
		int z = 4;
		
		y -= ++x + --y + z++ - --z + x++;
		
		
		System.out.println("\n=====\n");
		System.out.println("KQ x; " + x);
		System.out.println("KQ y; " + y);
		System.out.println("KQ z; " + z);

	}
}
