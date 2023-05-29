package bean;

import common.Sex;

public class Student {
	private String id;
	private String name;
	private double score;
	private Sex sex;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String id, String name, double score, Sex sex) {
		this.id = id;
		this.name = name;
		this.score = score;
		this.sex = sex;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + ", sex=" + sex + "]";
	}
}
