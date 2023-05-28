package bean;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2175156946516646224L;
	private String id;
	private String name;
	private Double GPA;
	private String gender;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String id, String name, Double gPA, String gender) {
		super();
		this.id = id;
		this.name = name;
		GPA = gPA;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getGPA() {
		return GPA;
	}

	public void setGPA(Double gPA) {
		GPA = gPA;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", GPA=" + GPA + ", gender=" + gender + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(GPA, gender, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return this.getId() == other.getId();
	}

}
