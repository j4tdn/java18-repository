package student_management;

public class Student {
	private int id;
	private String name;
	private float markLT; // điểm lý thuyết
	private float markTH; // điểm thực hành

	public Student() {
	}

	public Student(int id, String name, float markLT, float markTH) {
		super();
		this.id = id;
		this.name = name;
		this.markLT = markLT;
		this.markTH = markTH;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarkLT() {
		return markLT;
	}

	public void setMarkLT(float markLT) {
		this.markLT = markLT;
	}

	public float getMarkTH() {
		return markTH;
	}

	public void setMarkTH(float markTH) {
		this.markTH = markTH;
	}

	public float calGPA() {
		return (float) ((markLT * 7 + markTH * 3) / 10); // tự đặt: ĐTB = (ĐLT*7+ĐBT*3)/10;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", markLT=" + markLT + ", markTH=" + markTH + "]";
	}

}
