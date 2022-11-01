package operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int x = 5;
		x -= 2+5;
		System.out.println("x ==>" + x);
		
		int y = 7;
		y = y + x;
		y += 2;
		System.out.println("x -->" + x);
		System.out.println("y -->" + y);
		
		x = 3;
		y = 5;
		int z = 2;
		
		y += y++ - --x + y++ + z++;
		System.out.println("x:" + x + "y:" + y + "z:" +z);
		x -= x++ + y-- + --z;
		System.out.println("x:" + x + "y:" + y + "z:" +z);
	}

}
