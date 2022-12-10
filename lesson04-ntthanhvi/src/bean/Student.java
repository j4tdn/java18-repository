package bean;

public class Student {
	private int studentCode;
	private String name;
	private float theoreticalpoint;
	private float practicepoints;


	public Student() {
	}

	public Student(int studentCode, String name, float theoreticalpoint, float practicepoints) {
		super();
		this.studentCode = studentCode;
		this.name = name;
		this.theoreticalpoint = theoreticalpoint;
		this.practicepoints = practicepoints;
	}

	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String i) {
		this.name = i;
	}

	public float getTheoreticalpoint() {
		return theoreticalpoint;
	}

	public void setTheoreticalpoint(float theoreticalpoint) {
		this.theoreticalpoint = theoreticalpoint;
	}

	public float getPracticepoints() {
		return practicepoints;
	}

	public void setPracticepoints(float practicepoints) {
		this.practicepoints = practicepoints;
	}
	public float average () {
		return (theoreticalpoint + practicepoints)/2;
	}

	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", name=" + name + ", theoreticalpoint=" + theoreticalpoint
				+ ", practicepoints=" + practicepoints + "]";
	}

}
