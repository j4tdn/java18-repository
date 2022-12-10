package exercises04_company;

import java.sql.Date;

public class Manager extends Employee{
	private int numberOfstaff;
	
	public Manager() {
		
	}

	public Manager(String name, Date dayofBirth, float slary, int numberOfstaff) {
		super(name, dayofBirth, slary);
		this.numberOfstaff = numberOfstaff;
	}

	public int getNumberOfstaff() {
		return numberOfstaff;
	}

	public void setNumberOfstaff(int numberOfstaff) {
		this.numberOfstaff = numberOfstaff;
	}
	
	
	@Override
	public String toString() {
		return "Manager [ name=" + getName() + ", dayofBirth=" + getDayofBirth() + ", slary=" + getSlary() + ", numberOfstaff=" + numberOfstaff + "]";
	}

	@Override
	float calcSalary() {
		return this.getSlary()*2200000;
	}

}
