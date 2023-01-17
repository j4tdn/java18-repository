package bean;

import java.sql.Date;

public class Person {
	private String fullName;
	private Date birthDay;
	private Double coefficientSalary;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String fullName, Date birthDay, Double coefficientSalary) {
		super();
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.coefficientSalary = coefficientSalary;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}


	public Double getCoefficientSalary() {
		return coefficientSalary;
	}

	public void setCoefficientSalary(Double coefficientSalary) {
		this.coefficientSalary = coefficientSalary;
	}

	@Override
	public String toString() {
		return "fullName=" + fullName + ", birthDay=" + birthDay + ", coefficientSalary=" + coefficientSalary
				+ ", ";
	}
}
