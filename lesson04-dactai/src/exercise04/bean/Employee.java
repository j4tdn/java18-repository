package exercise04.bean;

public class Employee extends Staff{
	private String departmentName;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String dob, float coefficientsSalary, String departmentName) {
		super(name, dob, coefficientsSalary);
		this.departmentName = departmentName;
		// TODO Auto-generated constructor stub
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	@Override
	public String toString() {
		return super.toString() + " ,name of department: " + departmentName;
	}

	@Override
	public float calSalary() {
		return (float)(this.getCoefficientsSalary() * 1250000);
	}
	
	
}
