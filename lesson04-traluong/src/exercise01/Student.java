package exercise01;

public class Student {
	private int studentID;
	private String studentName;
	private float theoryScore;
	private float practiceScore;
	
	public Student() {
	}

	public Student(int studentID, String studentName, float theoryScore, float practiceScore) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.theoryScore = theoryScore;
		this.practiceScore = practiceScore;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public float getTheoryScore() {
		return theoryScore;
	}

	public void setTheoryScore(float theoryScore) {
		this.theoryScore = theoryScore;
	}

	public float getPracticeScore() {
		return practiceScore;
	}

	public void setPracticeScore(float practiceScore) {
		this.practiceScore = practiceScore;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", theoryScore=" + theoryScore
				+ ", practiceScore=" + practiceScore + "]";
	}

	public float getOverallScore() {
		return (this.practiceScore + this.theoryScore)/2;
	}
	
	

}
