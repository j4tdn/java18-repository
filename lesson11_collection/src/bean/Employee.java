package bean;

import java.util.Objects;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	private Integer manageId;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String name, Double salary, Integer manageId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.manageId = manageId;
	}

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

	public Integer getManageId() {
		return manageId;
	}

	public void setManageId(Integer manageId) {
		this.manageId = manageId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", manageId=" + manageId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, manageId, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(id, other.id) && Objects.equals(manageId, other.manageId)
				&& Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}

	
	

}
