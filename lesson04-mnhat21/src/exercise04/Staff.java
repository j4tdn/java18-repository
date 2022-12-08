package exercise04;

import java.sql.Date;

public class Staff extends Employee {
	private String department;
	
	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Staff(String name, Date dob, float salaryCoe, String department) {
		super(name, dob, salaryCoe);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Staff [department=" + department + ", getName()=" + getName() + ", getDob()=" + getDob()
				+ ", getSalaryCoe()=" + getSalaryCoe() + "]";
	}

	@Override
	float calcSalary() {
		return this.getSalaryCoe() * 1250000;
	}
}
