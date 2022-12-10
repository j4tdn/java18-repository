package exercises04_company;

import java.sql.Date;

public class Director extends Employee {

	private float position;

	public Director() {

	}

	public Director(String name, Date dayofBirth, float slary, float position) {
		super(name, dayofBirth, slary);
		this.position = position;
	}

	public float getPosition() {
		return position;
	}

	public void setPosition(float position) {
		this.position = position;
	}
	

	@Override
	public String toString() {
		return "Director [ name=" + getName() + ", dayofBirth=" + getDayofBirth() + ", slary=" + getSlary() + ", position=" + position + "]" ;
	}

	@Override
	float calcSalary() {
		return (this.getSlary() + this.getPosition())* 3000000; 
	}

}
