package human_resource_management;

import java.sql.Date;

public class Director extends HumanResource {
	private double cPosition; // Hệ số chức vụ

	public Director() {
	}

	public Director(String name, Date dob, double cSalary, double cPosition) {
		super(name, dob, cSalary);
		this.cPosition = cPosition;
	}

	public double getcPosition() {
		return cPosition;
	}

	public void setcPosition(double cPosition) {
		this.cPosition = cPosition;
	}

	@Override
	public String toString() {
		return "Director [cPosition=" + cPosition + ", toString()=" + super.toString() + "]";
	}

	@Override
	double calSalary() {
		return (this.getcSalary() + cPosition) * 3000000;
	}

}
