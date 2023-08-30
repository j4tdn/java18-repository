package bean;

public class GoodStudent {
	private String name;
	private String subject;
	private float score;
	public GoodStudent() {
		// TODO Auto-generated constructor stub
	}
	public GoodStudent(String name, String subject, float score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "GoodStudent [name=" + name + ", subject=" + subject + ", score=" + score + "]";
	}
	
}
