package operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int x = 5;
		
		x -= 2 + 5;
		
		System.out.println("xxxxx ->>>> " + x);
		int y = 7;
		
		y = y + x;
		y += 2;
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
		
		x = 5;
		y = 8;
		int z = 4;
	}
}
