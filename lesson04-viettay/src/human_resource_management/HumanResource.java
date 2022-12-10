package human_resource_management;

import java.sql.Date;

public abstract class HumanResource {
	private String name;
	private Date dob;
	private double cSalary; // Coefficients salary: hệ số lương

	public HumanResource() {
	}

	public HumanResource(String name, Date dob, double cSalary) {
		super();
		this.name = name;
		this.dob = dob;
		this.cSalary = cSalary;
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

	public double getcSalary() {
		return cSalary;
	}

	public void setcSalary(double cSalary) {
		this.cSalary = cSalary;
	}

	@Override
	public String toString() {
		return "HumanResource [name=" + name + ", dob=" + dob + ", cSalary=" + cSalary + "]";
	}

	abstract double calSalary();
}
