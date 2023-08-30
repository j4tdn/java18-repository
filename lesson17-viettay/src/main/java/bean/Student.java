package bean;

public class Student {
	private int id;
	private String name;
	private String gender;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	
	public static Student of() {
		return new Student();
	}

	public int getId() {
		return id;
	}

	public Student withId(int id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Student withName(String name) {
		this.name = name;
		return this;
	}

	public String getGender() {
		return gender;
	}

	public Student withGender(String gender) {
		this.gender = gender;
		return this;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
}
