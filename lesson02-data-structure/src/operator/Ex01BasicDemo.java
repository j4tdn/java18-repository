package operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int x = 5;
		x -= 5 + 2;
		System.out.println("x1 --> " + x);
		
		int y = 7;
		y += 2;
		System.out.println("x2 -->" + x);
		
		x = 1;
		y = 2;
		int z = 3;
		
		y -= ++x + --y + z++ + --z + x++;
		// y = y - (++x + --y + z++ + --z + x++)
		
		System.out.println("\n===\n");
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
		System.out.println("z --> " + z);
	}
			
}
