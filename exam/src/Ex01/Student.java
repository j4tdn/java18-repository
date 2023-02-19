package Ex01;

public class Student {
	private int nos;
	private String name;
	private char score;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int nos, String name, char score) {
		super();
		this.nos = nos;
		this.name = name;
		this.score = score;
	}

	public int getNos() {
		return nos;
	}

	public void setNos(int nos) {
		this.nos = nos;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getScore() {
		return score;
	}

	public void setScore(char score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [nos=" + nos + ", name=" + name + ", score=" + score + "]";
	}
	
	

}
