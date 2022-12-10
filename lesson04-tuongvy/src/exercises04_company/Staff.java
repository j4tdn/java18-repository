package exercises04_company;

import java.sql.Date;

public class Staff extends Employee {
	private String nameDepartment;
	
	public Staff() {
		
	}

	public Staff(String name, Date dayofBirth, float slary, String nameDepartment) {
		super(name, dayofBirth, slary);
		this.nameDepartment = nameDepartment;
	}

	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}
	
	
	@Override
	public String toString() {
		return "Staff [name=" + getName() + ", dayofBirth=" + getDayofBirth() + ", slary=" + getSlary() + ", nameDepartment=" + nameDepartment + "]";
	}

	@Override
	float calcSalary() {
		return this.getSlary()*1250000;
	}
	
	
	
}
