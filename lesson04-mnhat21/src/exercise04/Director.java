package exercise04;

import java.sql.Date;

public class Director extends Employee {
	private float positionCoe;
	
	public Director() {
		// TODO Auto-generated constructor stub
	}

	public Director(String name, Date dob, float salaryCoe, float positionCoe) {
		super(name, dob, salaryCoe);
		this.positionCoe = positionCoe;
	}

	public float getPositionCoe() {
		return positionCoe;
	}

	public void setPositionCoe(int positionCoe) {
		this.positionCoe = positionCoe;
	}

	@Override
	public String toString() {
		return "Director [positionCoe=" + positionCoe + ", getName()=" + getName() + ", getDob()=" + getDob()
				+ ", getSalaryCoe()=" + getSalaryCoe() + "]";
	}

	@Override
	float calcSalary() {
		// TODO Auto-generated method stub
		return (this.getSalaryCoe() + this.positionCoe) * 3000000;
	}
	

	
	
}
