package Ex05.bean;

import java.io.Serializable;

public class Student implements Serializable{
	private int id;
	private String name;
	private float gpa;
	private String gender;
	
	private Student() {
		
	}

	public Student(int id, String name, float gpa, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gpa = gpa;
		this.gender = gender;
	}
	
	public static Student transfer(String line) {
        String[] parts = line.split(",");
        
        int id = Integer.parseInt(parts[0].trim());
	    String name = parts[1].trim();
	    float gpa = Float.parseFloat(parts[2].trim());
	    String gender = parts[3].trim();
        
        return new Student(id, name, gpa, gender);
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

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gpa=" + gpa + ", gender=" + gender + "]";
	}
	
	
	
	

}
