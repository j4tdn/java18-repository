package qlns;

import java.util.Scanner;

public class QlnsDemo {
	public static void main(String[] args) {
		NhanSu nva = new NhanVien("NhanVienA", "11-05-2002", 6.5, "thiet ke");
		NhanSu nvb = new NhanVien("NhanVienB", "11-06-2002", 6.3, "sua chua");
		NhanSu gdoc = new GiamDoc("GiamDocC", "06-05-2002", 7.2, 8);
		NhanSu tphong = new TruongPhong("TruongPhongD", "05-03-2002", 7, 20);
		NhanSu[] nhanSu = { nva, nvb, gdoc, tphong };
		for (NhanSu nsu : nhanSu) {
			System.out.println(nsu.toString());
		}
		for (NhanSu nsu : nhanSu) {
			System.out.println(nsu.GetLuong());
		}
	}
}
