package test;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int [] b = new int [3];
		for(int i=0;i<2;i++) {
			b[i]=0;
		}
		
		int [] c = new int [100];
		System.out.print("tuổi : ");
		int yearyou = ip.nextInt();
		System.out.println("Thời gian đã ngủ");
		System.out.println("	+ số giờ : ");
		int house = ip.nextInt();
		System.out.println("	+ số phút : ");
		int minues = ip.nextInt();
		String x = ip.nextLine();
		System.out.println("Thời gian bắt đầu ngủ: ");
		String timeStart = ip.nextLine();
		String [] d = new String [2];
		String [] a = timeStart.split("H");
		if(a.length==1) {
			d[0] = a[0];
			d[1] = "0";
		}
		for(int i=0;i<2;i++) {
			b[i]=Integer.parseInt(d[i]);
		}
		System.out.println("bạn nên thức dậy lúc : ");
		if(yearyou>=1&&yearyou<=3) {
			c = m(b, 20*60);
		}else if(yearyou>=4&&yearyou<=13) {
			c = m(b, 11*60);
		}else if(yearyou>=14&&yearyou<=17) {
			c = m(b, 9*60);
		}else if(yearyou>=18&&yearyou<=64) {
			c = m(b, 8*60);
		}else if(yearyou>=65) {
			c = m(b, 7*60+30);
		}
		for(int m : c) {
			System.out.print(m);
			System.out.print("H");
		}
		
	}
	
	private static int [] m (int []a ,int minues) {
		int [] ar = new int [2];
		ar[0]=((a[0]*60+a[1]+minues)/60)%24;
		ar[1]=(a[0]*60+a[1]+minues)%60;
		return ar;
	}
}
