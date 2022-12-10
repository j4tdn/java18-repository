package qlns;

public abstract class NhanSu {
	private String hoTen;
	private String ngaySinh;
	private double heSoLuong;
	public NhanSu() {

	}
	public NhanSu(String hoTen, String ngaySinh, double heSoLuong) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.heSoLuong = heSoLuong;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	@Override
	public String toString() {
		return "hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", heSoLuong=" + heSoLuong ;
	}
	abstract double GetLuong();
	
	
}
