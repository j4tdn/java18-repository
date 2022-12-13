package exercise01;

public class Student {
	private int id;
	private String name;
	private float theoryPoint;
	private float practicePoint;
	
	public Student() {
		id = 0;
		name = "";
		theoryPoint = 0;
		practicePoint = 0;	
	}
	
	public Student(int id, String name, float theoryScore, float practiceScore) {
		super();
		this.id = id;
		this.name = name;
		this.theoryPoint = theoryScore;
		this.practicePoint = practiceScore;
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

	public float getTheoryPoint() {
		return theoryPoint;
	}

	public void setTheoryPoint(float theoryPoint) {
		this.theoryPoint = theoryPoint;
	}

	public float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}
	
	public float calAvgPoint(float theoryPoint, float practicePoint) {
		return (theoryPoint+practicePoint)/2;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", theoryPoint=" + theoryPoint + ", practicePoint="
				+ practicePoint + "]";
	}

}
