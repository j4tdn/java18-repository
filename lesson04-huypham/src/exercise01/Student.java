package exercise01;

public class Student {
	private int msv;
	private String name;
	private float pointLT;
	private float pointTH;
	
	public Student() {
		
	}
	public Student(int msv, String name, float pointLT, float pointTH) {
		super();
		this.msv = msv;
		this.name = name;
		this.pointLT = pointLT;
		this.pointTH = pointTH;
	}
	public int getMsv() {
		return msv;
	}
	public void setMsv(int msv) {
		this.msv = msv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPointLT() {
		return pointLT;
	}
	public void setPointLT(float pointLT) {
		this.pointLT = pointLT;
	}
	public float getPointTH() {
		return pointTH;
	}
	public void setPointTH(float pointTH) {
		this.pointTH = pointTH;
	}
	public float mediumPoint(float pointLT, float pointTH) {
		return (this.pointLT + this.pointTH)/2;
	}
	@Override
	public String toString() {
		return "Student [msv=" + msv + ", name=" + name + ", pointLT=" + pointLT + ", pointTH=" + pointTH + "]";
	}

	
	
}
