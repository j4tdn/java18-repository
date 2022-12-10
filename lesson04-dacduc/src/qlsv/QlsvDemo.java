package qlsv;

import java.util.Scanner;

public class QlsvDemo {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(102200166,"NguyenDacDuc",8.6f,9.2f);
		SinhVien sv2 = new SinhVien(102200120,"PhanHuuThai",8.7f,9.5f);
		SinhVien sv3 = new SinhVien();
		SinhVien sv= input();
		sv3.setMsv(sv.getMsv());
		sv3.setFullName(sv.getFullName());
		sv3.setMarkTH(sv.getMarkTH());
		sv3.setMarkLT(sv.getMarkLT());
		SinhVien[] svien= {sv1,sv2,sv3};
		MarkTB(svien);
		MarkCompare(svien);
	
	}
	public static SinhVien input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap msv :");
		int msv = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap ho ten :");
		String fullname = sc.nextLine();
		System.out.println("Nhap Diem LT :");
		float markLT =Float.parseFloat(sc.nextLine());
		System.out.println("Nhap Diem TH :");
		float markTH =Float.parseFloat(sc.nextLine());
		SinhVien sv = new SinhVien(msv, fullname, markTH, markLT);
		return sv;
	}
	public static void MarkTB(SinhVien[] sv) {
		System.out.println("Sinh vien co DLT > DTH :");
		for (SinhVien s : sv) {
			if(s.getMarkLT()>s.getMarkTH()) {
				System.out.println("	+"+s.getFullName());
			}
		}
	}
	public static void MarkCompare(SinhVien[] sv) {
		System.out.println("Sinh vien co DTB > 8.5");
		for (SinhVien s : sv) {
			if(s.MarkTB()>8.5f) {
				System.out.println("	+"+s.getFullName());
			}
		}
	}
}
