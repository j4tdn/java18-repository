package bean;

public class Apple {
	private int id;
	private String color;
	private int salary;
	private String country;
	
	public Apple() {
		// TODO Auto-generated constructor stub
	}

	public Apple(int id, String color, int salary, String country) {
		this.id = id;
		this.color = color;
		this.salary = salary;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Apple [id=" + id + ", color=" + color + ", salary=" + salary + ", country=" + country + "]";
	}
	
	
	
}