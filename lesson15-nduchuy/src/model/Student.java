package model;

import common.Gender;

public class Student {
	private String mssv;
	private String fullname;
	private double gpa;
	private Gender gender;

	public Student() {
	}

	public Student(String mssv, String fullname, double gpa, Gender gender) {
		this.mssv = mssv;
		this.fullname = fullname;
		this.gpa = gpa;
		this.gender = gender;
	}

	public String getId() {
		return mssv;
	}

	public void setId(String mssv) {
		this.mssv = mssv;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + mssv + ", fullname=" + fullname + ", gpa=" + gpa + ", gender=" + gender + "]";
	}
}
