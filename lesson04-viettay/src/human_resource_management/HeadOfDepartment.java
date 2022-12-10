package human_resource_management;

import java.sql.Date;

public class HeadOfDepartment extends HumanResource {
	private int nEmployees; // number of employee: số lượng nhân viên quản lý

	public HeadOfDepartment() {
	}

	public HeadOfDepartment(String name, Date dob, double cSalary, int nEmployees) {
		super(name, dob, cSalary);
		this.nEmployees = nEmployees;
	}

	public int getnEmployees() {
		return nEmployees;
	}

	public void setnEmployees(int nEmployees) {
		this.nEmployees = nEmployees;
	}

	@Override
	public String toString() {
		return "HeadOfDepartment [nEmployees=" + nEmployees + ", toString()=" + super.toString() + "]";
	}

	@Override
	double calSalary() {
		return this.getcSalary() * 2200000;
	}

}
