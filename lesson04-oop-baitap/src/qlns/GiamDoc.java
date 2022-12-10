package qlns;

public class GiamDoc extends NhanSu{
	private double heSoChucVu;
	public GiamDoc() {
	}
	public GiamDoc(String hoTen, String ngaySinh, double heSoLuong,double heSoChucVu) {
		super(hoTen, ngaySinh, heSoLuong);
		this.heSoChucVu = heSoChucVu;
	}
	
	public double getHeSoChucVu() {
		return heSoChucVu;
	}
	public void setHeSoChucVu(double heSoChucVu) {
		this.heSoChucVu = heSoChucVu;
	}
	@Override
	public String toString() {
		return super.toString()+", hoSoChucVu=" + heSoChucVu;
	}
	public double GetLuong() {
		return (this.getHeSoLuong()+this.getHeSoChucVu())*3000000;
	}
}
