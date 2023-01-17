package bean;

import java.sql.Date;

public class Manager extends Person {
	private int manyOfStaff;

	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	public Manager(String fullName, Date birthDay, Double coefficientSalary, int manyOfStaff) {
		super(fullName, birthDay, coefficientSalary);
		this.manyOfStaff = manyOfStaff;
	}

	public int getManyOfStaff() {
		return manyOfStaff;
	}
	
	public void setManyOfStaff(int manyOfStaff) {
		this.manyOfStaff = manyOfStaff;
	}

	@Override
	public String toString() {
		return "Manager [" + super.toString() + "manyOfStaff=" + manyOfStaff + "]";
	}

}
