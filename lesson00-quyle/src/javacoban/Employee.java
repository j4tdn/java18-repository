package javacoban;

public class Employee extends Person {
	private float salary;
	private float rate;
	public Employee() {
	}
	public Employee(String name, int age, String adress, float salary, float rate) {
		super(name, age, adress);
		this.salary = salary;
		this.rate = rate;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return salary + " , " + rate + " , " + super.toString();
	}
	
}
