package operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {
	int x = 5; 
	int y = 7;
	
	y = y + x;
	System.out.println("x--> " + x);
	System.out.println("y--> " + y);
	
	y += 2;
	
	// var++
	// khi sử dụng suffix để in ra hoặc tính toán trong 
	// một biểu thức thì 
	
	System.out.println("x++ ==>" + x++);
	System.out.println("++y ==>" + ++y);
	
	x = 1;
	y = 2;
	int z = 3;
	y = y - ++x + --y + z++ - --z + x++;
	/*
	 * 0; x = 2; y = 2
	 * y = 1; 1
	 * 4; z = 4;
	 * z = 3; 1
	 * 3 ; x = 3
	 * y = 3;
	 */
	System.out.println("X: " + x);
	System.out.println("Y: " + y);
	System.out.println("Z: " + z);

	
	
	}
}