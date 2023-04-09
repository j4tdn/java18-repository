package mapdemo;

public class Employee {
	private Integer ID;
	private String Name;
	private Double Salary;
	private Integer ManagerID;
	public Employee() {
	}
	public Employee(Integer iD, String name, Double salary, Integer managerID) {
		ID = iD;
		Name = name;
		Salary = salary;
		ManagerID = managerID;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}
	public Integer getManagerID() {
		return ManagerID;
	}
	public void setManagerID(Integer managerID) {
		ManagerID = managerID;
	}
	@Override
	public String toString() {
		return "Ex01 [ID=" + ID + ", Name=" + Name + ", Salary=" + Salary + ", ManagerID=" + ManagerID + "]";
	}
	

}
