package bean;

public class Class {
	private Integer id;
	private String name;
	private String teacher;

	public Class() {
	}

	public Class(Integer id, String name, String teacher) {
		this.id = id;
		this.name = name;
		this.teacher = teacher;
	}

	public static Class of() {
		return new Class();
	}

	public Integer getId() {
		return id;
	}

	public Class withId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Class withName(String name) {
		this.name = name;
		return this;
	}

	public String getTeacher() {
		return teacher;
	}

	public Class withTeacher(String teacher) {
		this.teacher = teacher;
		return this;
	}

	@Override
	public String toString() {
		return "Class [id=" + id + ", name=" + name + ", teacher=" + teacher + "]";
	}

}
