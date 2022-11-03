package operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int x = 5;
		
		x -= 2 + 5;
		System.out.println("xxxxx ->>> " + x);
		
		int y = 7;

		y = y + x;
		
		
		y += 2;
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
		
		System.out.println("x++ ==>" + x++);
		System.out.println("x1 ==>" + x);
		System.out.println("++y ==>" + ++y);
		System.out.println("y1 ==>" + y);
		
		x = 1;
		y = 2;
		int z = 3;
		
		
		y -= ++x + --y + z++ - --z + x++;
		System.out.println("`n====`n");
		System.out.println("KQ x: " + x);
		System.out.println("KQ y: " + y);
		System.out.println("KQ z: " + z);
	}
}
