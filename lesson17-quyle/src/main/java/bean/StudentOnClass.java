package bean;

public class StudentOnClass {
	private String name;
	private Integer numberOfStuden;

	public StudentOnClass() {
		// TODO Auto-generated constructor stub
	}

	public StudentOnClass(String name, Integer numberOfStuden) {
		this.name = name;
		this.numberOfStuden = numberOfStuden;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumberOfStuden() {
		return numberOfStuden;
	}

	public void setNumberOfStuden(Integer numberOfStuden) {
		this.numberOfStuden = numberOfStuden;
	}

	@Override
	public String toString() {
		return "StudentOnClass [name=" + name + ", numberOfStuden=" + numberOfStuden + "]";
	}
	
	
	
}
