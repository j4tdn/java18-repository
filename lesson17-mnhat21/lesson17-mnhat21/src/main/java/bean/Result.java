package bean;

public class Result {

	
	private int studentId;
	private String subject;
	private float result;
	
	public Result() {
		// TODO Auto-generated constructor stub
	}

	public Result(int studentId, String subject, float result) {
		super();
		this.studentId = studentId;
		this.subject = subject;
		this.result = result;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public float getResult() {
		return result;
	}

	public void setResult(float result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Result [studentId=" + studentId + ", subject=" + subject + ", result=" + result + "]";
	}
	
	
}
