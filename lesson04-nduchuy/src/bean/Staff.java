package bean;

import java.sql.Date;

public class Staff extends Person {
	private String department;

	public Staff() {
		// TODO Auto-generated constructor stub
	}
	
	public Staff(String fullName, Date birthDay, Double coefficientSalary, String department) {
		super(fullName, birthDay, coefficientSalary);
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
		return "Staff [" + super.toString()+ "department=" + department + "]";
	}
		
}
