package view;

public class Candidate {
	private String id;
	private int score;
	
	public Candidate() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Candidate [id=" + id + ", score=" + score + "]";
	}
	
	
}
