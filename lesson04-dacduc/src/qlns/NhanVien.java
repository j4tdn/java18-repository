package qlns;

public class NhanVien extends NhanSu{
	private String tenDonVi;
	public NhanVien() {
	}
	public NhanVien(String hoTen, String ngaySinh, double heSoLuong,String tenDonVi) {
		super(hoTen, ngaySinh, heSoLuong);
		this.tenDonVi = tenDonVi;
	}
	
	public String getTenDonVi() {
		return tenDonVi;
	}
	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}
	@Override
	public String toString() {
		return super.toString()+", tenDonVi=" + tenDonVi;
	}
	public double GetLuong() {
		return this.getHeSoLuong()*1250000;
	}
}
