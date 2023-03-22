package homework;

import java.util.Scanner;

public class HomeWork1 {
	public static void main(String[] args) {
		//int[] a = new int [];
		Scanner ip = new Scanner(System.in);
		System.out.println("nhập n : ");
		int n = ip.nextInt();
		System.out.println("nhập số phần tử mảng : ");
		int[] a = new int [n+1];
		int[] b = new int [n+1];
		for(int i=1;i<=n;i++) {
			System.out.print("a["+i+"]" + " = " );
			a[i]=ip.nextInt();
			System.out.println("");
		}
		System.out.println("nhập phương thức : \n"
				+ "1 Loại bỏ những phần tử trùng nhau \n"
				+ "2 So sánh giá trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng \n"
				+ "3 Tìm số lớn thứ 3 trong mảng. Lưu ý trường hợp các phần tử lớn nhất trùng nhau \n");
		int j=ip.nextInt();
		if(j==1) {
			dk1(a, b, n);
		}else if(j==2) {
			dk2(a, n);
		}else if(j==3) {
			dk3(a, b, n);
		}else {
			System.out.println("thoát chương trình");
		}
		//Arrays.sort(a);
		//dk1(a, b, n);
		
		//System.out.println(Arrays.toString(a));
		
	}
	public static void dk1(int a[],int b[],int n) {
		for(int i=1;i<=n;i++) {
			b[a[i]]++;
		}
		for(int i=1;i<=n;i++) {
			if(b[i]==1) {
				System.out.print(i + "  ");
			}
		}
	}
	public static void dk2(int a[],int n) {
		int b= n/2;
		int tonga=0,tongb=0;
		for(int i=1;i<=b;i++) {
			tonga+=a[i];
			tongb+=a[i+b];
		}
		System.out.println("tổng n/2 số hạng đầu tiên - tổng n/2 số hạng cuối là : " + (tonga-tongb));
	}
	public static void dk3(int a[],int b[],int n) {
		//Arrays.sort(a);
		for(int i=1;i<=n;i++) {
			b[a[i]]++;
		}
		System.out.println(b[n-2]);
	}
}

