package operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int x = 5;
		x -= 2 + 5;
		
		System.out.println("xxxx ->>>>" + x);
		
		int y = 7;
		
		System.out.println("y ==> " + y);
		
		y = y + x;
		y += 2;
		System.out.println("y ==> " + y);
		
		x = 1;
		y = 2;
		int z = 3;
		
		z += x++ + --y - z++;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}
}
