package qlsv;

public class SinhVien {
	private int msv;
	private String fullName;
	private float markTH;
	private float markLT;
	public SinhVien() {
	}
	public SinhVien(int msv, String fullName, float markTH, float markLT) {
		this.msv = msv;
		this.fullName = fullName;
		this.markTH = markTH;
		this.markLT = markLT;
	}
	public int getMsv() {
		return msv;
	}
	public void setMsv(int msv) {
		this.msv = msv;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public float getMarkTH() {
		return markTH;
	}
	public void setMarkTH(float markTH) {
		this.markTH = markTH;
	}
	public float getMarkLT() {
		return markLT;
	}
	public void setMarkLT(float markLT) {
		this.markLT = markLT;
	}
	public float MarkTB() {
		return (this.markLT+this.markTH)/2;
	}
	@Override
	public String toString() {
		return "SinhVien: msv=" + msv + ", fullName=" + fullName + ", markTH=" + markTH + ", markLT=" + markLT;
	}
	
}
