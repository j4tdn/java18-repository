package bean;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private double mediumMark;
	private String gender;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, double mediumMark, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.mediumMark = mediumMark;
		this.gender = gender;
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
	public double getMediumMark() {
		return mediumMark;
	}
	public void setMediumMark(double mediumMark) {
		this.mediumMark = mediumMark;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mediumMark=" + mediumMark + ", gender=" + gender + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(!(obj instanceof Student)) {
			return false;
		}
		Student that = (Student)obj;
		
		return getId() == that.getId();
	}
	
	
}
