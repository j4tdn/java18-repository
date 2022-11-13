package operator;

import java.util.Random;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		// 0.0 - 1.0 * 10
		// (int)(Math.random()*10) // 5.6 --> 6
		
		// & | ^(XOR) !
		
		// 5 & 3 --> toBin(5(100)) & toBin(3(11))
		// 100 & 11 --> bin --> toDecimal(bin)
		
		int x = 5;
		
		x -= 2 + 5;
		// x = x - 7 ==> -2
		// x = x - 2 + 5 ==> 8
		System.out.println("xxxxxx ->>>> " + x); // -2
		
		int y = 7;
		
		y = y + x; // y(12) x(5)
		y += 2; // y(14)
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
		
		// var++
		// khi sử dụng suffix để in ra hoặc tính toán trong
		// một biểu thức thì -->
		// --> B1: sử dụng giá trị hiện tại của var
		// --> B2: tăng var lên 1 đơn vị
		
		// ++var
		// khi sử dụng suffix để in ra hoặc tính toán trong
		// một biểu thức thì -->
		// --> B1: tăng var lên 1 đơn vị
		// --> B2: sử dụng giá trị hiện tại của var
		
		// x(5), y(14)
		System.out.println("x++ ==>" + x++); // suffix 5
		System.out.println("x1 ==>" + x);    // 6
		
		System.out.println("++y ==>" + ++y); // prefix 15
		System.out.println("y1 ==>" + y);    // 15
		
		x = 1;
		y = 2;
		int z = 3;
		// y -= ++x + --y + z++ - --z + x++;
		// VT = VP ==> VP trước
		// trong 1 vế --> đi từ trái sang phải
		y -= ++x + --y + z++ - --z + x++;
		
		// y = y - ++x + --y + z++ - --z + x++;
		
		// x ==> 2  3
		// y ==> -2 -4 1 -3 -6
		// z ==> 3 4
		System.out.println("\n=====\n");
		System.out.println("KQ x: " + x);
		System.out.println("KQ y: " + y);
		System.out.println("KQ z: " + z);
		
	}
}
