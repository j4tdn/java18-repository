package mapdemo;

import java.util.Objects;

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
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(!(o instanceof Employee)) {
			return false;
		}else {
			Employee that = (Employee)o;
			return getID().equals(that.getID());
		}
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(getID());
	}
	
	@Override
	public String toString() {
		return "Ex01 [ID=" + ID + ", Name=" + Name + ", Salary=" + Salary + ", ManagerID=" + ManagerID + "]";
	}
	

}
