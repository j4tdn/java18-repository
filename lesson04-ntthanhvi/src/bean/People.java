package bean;

public class People {
	private String name;
	private int birthday;
	private double salaryCoe;

	
	public People() {
	}

	public People(String name, int birthday, double salaryCoe) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.salaryCoe = salaryCoe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public double getSalaryCoe() {
		return salaryCoe;
	}

	public void setSalaryCoe(double salaryCoe) {
		this.salaryCoe = salaryCoe;
	}
	
	@Override
	public String toString() {
		return "People [name=" + name + ", birthday=" + birthday + ", salaryCoe=" + salaryCoe + "]";
	}

}