package bean;

public class Staff extends People {
	public String unit;

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Staff(String name, int birthday, double salaryCoe, String unit) {
		super(name, birthday, salaryCoe);
		this.unit = unit;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "Staff [unit=" + unit + ", toString()=" + super.toString() + "]";
	}

}
