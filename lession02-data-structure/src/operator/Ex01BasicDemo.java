package operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int x = 5;
		int y = 7;

		y = y + x; // y(12) x(5)
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);

		y += 2; // y(14)

		// var++
		// khi sử dụng suffix để in ra hoặc tính toán trong
		// một biểu thức thì -->
		// B1: sử dụng giá trị hiện tại
		// B2: tăng var lên 1 đơn vị

		// var++
		// khi sử dụng suffix để in ra hoặc tính toán trong
		// một biểu thức thì -->
		// B1: tăng var lên 1 đơn vị
		// B2: sử dụng giá trị hiện tại

		System.out.println("x++ ==>" + x++); // suffix 5
		System.out.println("x1 --> " + x); // 6

		System.out.println("++y ==>" + ++y); // prefix 15
		System.out.println("y1 --> " + y); // 15

		x = 1;
		y = 2;
		int z = 3;
		
		//VT = VP ==> VP trước
		// trong 1 vế --> đi từ trái sang phải
		y-= ++x + --y + z++ - --z + x++;
		
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
		System.out.println("z --> " + z);
	}
}
