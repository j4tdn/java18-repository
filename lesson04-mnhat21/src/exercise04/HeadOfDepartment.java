package exercise04;

import java.sql.Date;

public class HeadOfDepartment extends Employee {
	private int amountOfStaff;
	
	public HeadOfDepartment() {
		// TODO Auto-generated constructor stub
	}

	public HeadOfDepartment(String name, Date dob, float salaryCoe, int amountOfStaff) {
		super(name, dob, salaryCoe);
		this.amountOfStaff = amountOfStaff;
	}

	public int getAmountOfStaff() {
		return amountOfStaff;
	}

	public void setAmountOfStaff(int amountOfStaff) {
		this.amountOfStaff = amountOfStaff;
	}

	@Override
	public String toString() {
		return "HeadOfDepartment [amountOfStaff=" + amountOfStaff + ", getName()=" + getName() + ", getDob()="
				+ getDob() + ", getSalaryCoe()=" + getSalaryCoe() + "]";
	}

	@Override
	float calcSalary() {
		return this.getSalaryCoe() * 2200000;
	}
}
