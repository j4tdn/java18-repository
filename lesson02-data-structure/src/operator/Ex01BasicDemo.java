package operator;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		int x = 5;
		x -= 2 + 5;
		System.out.println("x: " + x); // -2

		int y = 7;
		y = y + x;
		y += 2;
		System.out.println("x: " + x);
		System.out.println("y:" + y);
		
		x = 1;
		y = 2;
		int z = 3;
		y -= ++x + --y + z++ - --z + x++;
		// VT = VP => VP trước
		// trong 1 vế --> đi từ trái sang phải
		System.out.println("\n====\n");
		System.out.println("KQ x= " + x);
		System.out.println("KQ x= " + y);
		System.out.println("KQ x= " + z);

	}

}
