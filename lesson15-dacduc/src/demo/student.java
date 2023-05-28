package demo;

public class student {
	String msv;
	String name;
	double point;
	String gender;
	
	public student(String msv, String name, double point, String gender) {
		super();
		this.msv = msv;
		this.name = name;
		this.point = point;
		this.gender = gender;
	}
	public String getMsv() {
		return msv;
	}
	public void setMsv(String msv) {
		this.msv = msv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "student [msv=" + msv + ", name=" + name + ", point=" + point + ", gender=" + gender + "]";
	}
	
	
}