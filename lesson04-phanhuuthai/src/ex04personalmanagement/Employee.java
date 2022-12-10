package ex04personalmanagement;

public class Employee extends Personal{
	private String unitName;
	
	public Employee() {
	}

	public Employee(String name, String dob, double cofficientsSalary, String unitName) {
		super(name, dob, cofficientsSalary);
		this.unitName = unitName;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	@Override
	public String toString() {
		return "Employee [unitName=" + unitName + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public double calSalary() {
		return this.getCofficientsSalary()*1250000;
	}
}
