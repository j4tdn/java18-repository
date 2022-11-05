package operator;

public class Ex01BasicDemo {
     public static void main(String[] args) {
		int x = 5;
		
		x-= 2 + 5;
		// x = x - (2+5) ==> -2
		System.out.println("xxxxx =>>" + x); //-2
		
		int y = 7; 
		
		 y= y + x; // y(12) x(5)
		
		y+=2; //y(14)
		System.out.println("x --> " +x);
		System.out.println("y --> " + y);
		
		
		/* var++
		 * + Khi sử dụng suffix để in ra hoặc tính toán trong một biểu thức thì -->
		 * ===> Bước 1 : sử dụng giá trị hiện tại của var
		 * ===> Bước 2 : tăng var lên 1 đơn vị 
		 * 
		 */
		
		
		/* ++var
		 * Khi sử dụng prefix để in ra hoặc tính toán trong một biểu thức thì -->
		 * ===> Bước 1 :  tăng var lên 1 đơn vị
		 * ===> Bước 2 : sử dụng giá trị hiện tại của var
		 */
		
		// x(5)    y(14)
		System.out.println("x++ ==>" + x++); //suffix 5
		System.out.println("x1 ==>" +x);     // 6
		
		System.out.println("++y ==>" + ++y); //frefix 15
		System.out.println("y1 ==>" + y);    // 15
		
		
		x = 1; //2 3
		y = 2; // 1
		int z = 3; // 4 3
		// ĐỀ : y-= ++x + --y + z++ - --z + x++;
		//VT = VP ==> VP làm trước
		// trong 1 vế --> đi từ trái sang phải, có dấu - thì chuyển qua đổi dấu
		//      y= y - ++x + --y + z++ - --z + x++;
		//       = 2 - 2   + 1   - 3   +  3  -2
		// KẾT QUẢ  3 3 3 nhưng đề là -= nên là  3 -3 3
		
		y -= ++x +--y + z++ - --z + x++;
		// x ==>  2 3
		// y ==>  -2 -4 -3 -6
		// z ==>  3 4
		System.out.println("\n====\n");
		System.out.println("KQ x: " +x);
		System.out.println("KQ y: " +y);
		System.out.println("KQ z:"  +z);
		
	}
}
