package bean;

public class Student {
	private Integer id;
	private String name;
	private Boolean gender;
	private Integer class_id;
	
	public Student() {
		
	}
	
	public Student(Integer id, String name, Boolean gender, Integer class_id) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.class_id = class_id;
	}
	
	public static Student of() {
		return new Student();
	}

	public Integer getId() {
		return id;
	}

	public Student withId(Integer id) {
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

	public Boolean getGender() {
		return gender;
	}

	public Student withGender(Boolean gender) {
		this.gender = gender;
		return this;
	}

	public Integer getClass_id() {
		return class_id;
	}

	public Student withClass_id(Integer class_id) {
		this.class_id = class_id;
		return this;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", class_id=" + class_id + "]";
	}
	
	
	
	

}
