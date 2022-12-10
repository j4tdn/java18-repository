package ex01;

/**
 * Viết chương trình OOP quản lý sinh viên đơn giản: Nhập xuất thông tin, tính điểm TB. 
 * Tạo lớp Sinh viên như sau: Attributes (private): Mã sinh viên là số nguyên. 
 * Họ tên: chuỗi ký tự. Điểm LT, điểm TH : float
 */

public class Student {
	private int id;
	private String fullname;
	private float theoreticalPoint;
	private float practicePoint;

	public Student() {
	}

	public Student(int id, String fullname, float theoreticalPoint, float practicePoint) {
		this.id = id;
		this.fullname = fullname;
		this.theoreticalPoint = theoreticalPoint;
		this.practicePoint = practicePoint;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public float getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public void setTheoreticalPoint(float theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}

	public float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}

	// average point
	public float getAveragePoint() {
		return (theoreticalPoint + practicePoint) / 2;
	}

	@Override
	public String toString() {
		return getId() + ", " + getFullname() + ", " + getTheoreticalPoint() + ", " + getPracticePoint();
	}

}
