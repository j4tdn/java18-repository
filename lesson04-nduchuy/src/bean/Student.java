package bean;

public class Student {
	private int studentCode;
	private String fullName;
	private float theoreticalPoint;
	private float practicePoints;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int studentCode, String fullName, float theoreticalPoint, float practicePoints) {
		this.studentCode = studentCode;
		this.fullName = fullName;
		this.theoreticalPoint = theoreticalPoint;
		this.practicePoints = practicePoints;
	}

	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public float getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public void setTheoreticalPoint(float theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}

	public float getPracticePoints() {
		return practicePoints;
	}

	public void setPracticePoints(float practicePoints) {
		this.practicePoints = practicePoints;
	}
	
	public float average() {
		return (practicePoints+theoreticalPoint)/2;
	}

	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", fullName=" + fullName + ", theoreticalPoint="
				+ theoreticalPoint + ", practicePoints=" + practicePoints + "]";
	}
	
	
	
	
}
