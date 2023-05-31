package b5;

public class Student {
	private String mssv;
	private String hoTen;
	private double diemTB;
	private String gioiTinh;

	public Student(String mssv, String hoTen, double diemTB, String gioiTinh) {
		this.mssv = mssv;
		this.hoTen = hoTen;
		this.diemTB = diemTB;
		this.gioiTinh = gioiTinh;
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	@Override
	public String toString() {
		return mssv + ", " + hoTen + ", " + diemTB + ", " + gioiTinh;
	}

}
