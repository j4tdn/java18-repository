package operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int x = 5;

		x -= 2 + 5;
		// x = x - 7 ==> -2
		// x = x - 2 + 5 ==>8
		System.out.println("xxxxxxx -->" + x);

		int y = 7;

		x = 1;
		y = 2;
		int z = 3;
		y -= ++x + --y + z++ - --z + x++;
		System.out.println(x + " " + y + " " + z);
		
		
		x = 2;
		y = 1;
		z = 3;
		
		y += x++ - ++y; // x = 3, y = 1, z = 3 
		System.out.println("res ->>>>" + x + " " + y + " " + z);
		x = x++ + --z - y++;// x = 4, y = 2,z = 2
		System.out.println("res ->>>>" + x + " " + y + " " + z);
		z = x++ + --y;// x = 5, y = 1, z = 5
		
		System.out.println("res ->>>>" + x + " " + y + " " + z);

	}
}
