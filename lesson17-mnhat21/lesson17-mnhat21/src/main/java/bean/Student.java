package bean;

public class Student {
	
	private int id;
	private String name;
	private String gender;
	private int classId;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String gender, int classId) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.classId = classId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", classId=" + classId + "]";
	}
	
	
}
