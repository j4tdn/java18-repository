package operator;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;
		
		//Suffix: var++
		// --> B1: sử dụng giá trị hiện tại của var
		// --> B2: tăng var lên 1 đơn vị
		// prefix: ++var
		// --> B1: Tăng var lên 1 đơn vị
		// --> B2: sử dụng giá trị hiện tại của var
		 
		/*System.out.println("x++ ==> " + x++); // sufix
		System.out.println("x1 ==> " + x);

		System.out.println("++y ==> " + ++y); // prefix
		System.out.println("y1 ==> " + y);
		*/ 

		y -= ++x + --y +z++ - --z +x++;
		
		System.out.println("\n====\n");
		System.out.println("KQ x: " + x);
		System.out.println("KQ y: " + y);
		System.out.println("KQ z: " + z);

	}
}
