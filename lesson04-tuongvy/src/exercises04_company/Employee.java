package exercises04_company;

import java.sql.Date;

public abstract class Employee {
	private String name;
	private Date dayofBirth;
	private float slary;
	
	public Employee() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDayofBirth() {
		return dayofBirth;
	}
	public void setDayofBirth(Date dayofBirth) {
		this.dayofBirth = dayofBirth;
	}
	public float getSlary() {
		return slary;
	}
	public void setSlary(float slary) {
		this.slary = slary;
	}
	public Employee(String name, Date dayofBirth, float slary) {
		super();
		this.name = name;
		this.dayofBirth = dayofBirth;
		this.slary = slary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dayofBirth=" + dayofBirth + ", slary=" + slary + "]";
	}
	
	abstract float calcSalary();


}
