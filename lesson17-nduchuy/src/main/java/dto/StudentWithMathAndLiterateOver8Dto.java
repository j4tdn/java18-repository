package dto;

import java.util.List;

public class StudentWithMathAndLiterateOver8Dto {
	private String className;
	private int numberOfStudents;
	private List<String> studentNames;
	public StudentWithMathAndLiterateOver8Dto() {
		// TODO Auto-generated constructor stub
	}
	public StudentWithMathAndLiterateOver8Dto(String className, int numberOfStudents, List<String> studentNames) {
		this.className = className;
		this.numberOfStudents = numberOfStudents;
		this.studentNames = studentNames;
	}

	public static StudentWithMathAndLiterateOver8Dto of() {
		return new StudentWithMathAndLiterateOver8Dto();
	}

	public String getClassName() {
		return className;
	}

	public StudentWithMathAndLiterateOver8Dto withClassName(String className) {
		this.className = className;
		return this;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public StudentWithMathAndLiterateOver8Dto withNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
		return this;
	}

	public List<String> getStudentNames() {
		return studentNames;
	}

	public StudentWithMathAndLiterateOver8Dto withStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
		return this;
	}

	@Override
	public String toString() {
		return "className=" + className + ", numberOfStudents=" + numberOfStudents + ", studentNames="
				+ studentNames ;
	}

}
