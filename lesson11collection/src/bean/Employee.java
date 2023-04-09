package bean;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	private Integer ManagerId;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer id, String name, Double salary, Integer managerId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		ManagerId = managerId;
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
	public Integer getManagerId() {
		return ManagerId;
	}
	public void setManagerId(Integer managerId) {
		ManagerId = managerId;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", ManagerId=" + ManagerId + "]";
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) {
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
		return Objects.hash(getId());
	}
	
}
