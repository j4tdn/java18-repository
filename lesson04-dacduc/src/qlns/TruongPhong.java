package qlns;

public class TruongPhong extends NhanSu {
	private int slNhanVien;
	public TruongPhong() {
	}
	public TruongPhong(String hoTen, String ngaySinh, double heSoLuong,int slNhanVien) {
		super(hoTen, ngaySinh, heSoLuong);
		this.slNhanVien = slNhanVien;
	}
	
	public int getSlNhanVien() {
		return slNhanVien;
	}
	public void setSlNhanVien(int slNhanVien) {
		this.slNhanVien = slNhanVien;
	}
	@Override
	public String toString() {
		return super.toString()+", slNhanVien=" + slNhanVien;
	}
	public double GetLuong() {
		return this.getHeSoLuong()*2200000;
	}
}
