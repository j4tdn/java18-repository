package human_resource_management;

import java.sql.Date;

public class Employee extends HumanResource {
	private String nDepartment; // name department: tên phòng ban

	public Employee() {
	}

	public Employee(String name, Date dob, double cSalary, String nDepartment) {
		super(name, dob, cSalary);
		this.nDepartment = nDepartment;
	}

	public String getnDepartment() {
		return nDepartment;
	}

	public void setnDepartment(String nDepartment) {
		this.nDepartment = nDepartment;
	}

	@Override
	public String toString() {
		return "Employee [nDepartment=" + nDepartment + ", toString()=" + super.toString() + "]";
	}

	@Override
	double calSalary() {
		return this.getcSalary() * 1250000;
	}
}
