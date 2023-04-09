package bean;

import java.util.Objects;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	private Integer managerId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public Employee(Integer id, String name, Double salary, Integer managerId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.managerId = managerId;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if (!(o instanceof Employee)) {
			return false;
		}
		Employee that = (Employee)o;
		return getId().equals(that.getId());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId().hashCode());
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", managerId=" + managerId + "]";
	}
	
	
	

}
