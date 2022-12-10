package ex01studentmanagement;

public class Student {
	private int id;
	private String name;
	private float ltMark, thMark;
	
	public Student() {
	}

	public Student(int id, String name, float ltMark, float thMark) {
		super();
		this.id = id;
		this.name = name;
		this.ltMark = ltMark;
		this.thMark = thMark;
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

	public float getLtMark() {
		return ltMark;
	}

	public void setLtMark(float ltMark) {
		this.ltMark = ltMark;
	}

	public float getThMark() {
		return thMark;
	}

	public void setThMark(float thMark) {
		this.thMark = thMark;
	}

	public float mediumMark() {
		return (this.ltMark + this.thMark)/2;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", ltMark=" + ltMark + ", thMark=" + thMark + "]";
	}
	
	
}
