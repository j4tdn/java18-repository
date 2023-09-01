package bean;

public class Student {
	private Integer id;
	private String name;
	private String gender;
	private Integer classId;

	public Student() {
	}

	public Student(Integer id, String name, String gender, Integer classId) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.classId = classId;
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

	public String getGender() {
		return gender;
	}

	public Student withGender(String gender) {
		this.gender = gender;
		return this;
	}

	public Integer getClassInfo() {
		return classId;
	}

	public Student withClassId(Integer classId) {
		this.classId = classId;
		return this;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", classId=" + classId + "]";
	}

}