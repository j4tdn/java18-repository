package exercise04;

import java.sql.Date;

public abstract class Employee {
	private String name;
	private Date dob;
	private float salaryCoe;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, Date dob, float salaryCoe) {
		this.name = name;
		this.dob = dob;
		this.salaryCoe = salaryCoe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public float getSalaryCoe() {
		return salaryCoe;
	}

	public void setSalaryCoe(int salaryCoe) {
		this.salaryCoe = salaryCoe;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dob=" + dob + ", salaryCoe=" + salaryCoe + "]";
	}
	
	abstract float calcSalary();
	
}
