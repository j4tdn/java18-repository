package bean;

public class Student {
	
	private Integer id;
	private String name;
	private String gender;
	private int class_id;
	
	public Student(Integer id, String name, String gender, int class_id) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.class_id = class_id;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", class_id=" + class_id + "]";
	}
	
}
