package homework1;

public class Student {
	private int id;
	private String name;
	private float Theory;
	private float Practice;

	public Student() {
	}

	public Student(int id, String name, float theory, float practice) {
		this.id = id;
		this.name = name;
		Theory = theory;
		Practice = practice;
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

	public float getTheory() {
		return Theory;
	}

	public void setTheory(float theory) {
		Theory = theory;
	}

	public float getPractice() {
		return Practice;
	}

	public void setPractice(float practice) {
		Practice = practice;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Theory=" + Theory + ", Practice=" + Practice + "]";
	}
	
}
