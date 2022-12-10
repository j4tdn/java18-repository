package triangle_pascal;

import java.util.Scanner;
/**
 * 
Bài 3: 		Viết chương trình in ra màn hình tam giác Pascal. Ví dụ, với n=4 sẽ in ra hình sau:

			1 1			<=>  	C(0,1)   C(1,1)	   
			1 2 1				C(0,2) 	 C(1,2)   C(2,2)
			1 3 3 1				C(0,3) 	 C(1,3)   C(2,3)   C(3,3)       						
			1 4 6 4 1			C(0,4) 	 C(1,4)   C(2,4)   C(3,4)   C(4,4) 
			1 5 10 10 5 1		...............................................
			
			C(k,n) = n! / (n-k)! * k!
     					
			... Hàng thứ n được xác định từ hàng n-1:
			- Phần tử đầu tiên và phần tử cuối cùng đều bằng 1.
			- Phần tử thứ 2 là tổng của phần tử thứ nhất và thứ 2 của hàng n-1
			- Phần tử thứ k của hàng thứ n là tổng của phần tử thứ k-1 và k của hàng thứ n-1		
 *
 */
public class PrintPascalTriangle {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = ip.nextInt();
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i + 1; j++) {
				System.out.print(ckn(j, i + 1) + " ");
			}
			System.out.println();
		}
	}

	private static int factorial(int i) {
		if (i == 0)
			return 1;
		return i * factorial(i - 1);
	}

	// C(k,n) = n! / (n-k)! * k!
	private static int ckn(int k, int n) {
		return factorial(n) / (factorial(n - k) * factorial(k));
	}
}
