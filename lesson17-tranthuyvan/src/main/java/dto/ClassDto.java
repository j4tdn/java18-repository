package dto;

import java.util.List;

public class ClassDto {
	private String className;
	private int numberOfStudents;
	private List<String> studentNames;

	public ClassDto() {
	}

	public ClassDto(String className, int numberOfStudents, List<String> studentNames) {
		this.className = className;
		this.numberOfStudents = numberOfStudents;
		this.studentNames = studentNames;
	}

	public static ClassDto of() {
		return new ClassDto();
	}

	public String getClassName() {
		return className;
	}

	public ClassDto withClassName(String className) {
		this.className = className;
		return this;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public ClassDto withNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
		return this;
	}

	public List<String> getStudentNames() {
		return studentNames;
	}

	public ClassDto withStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
		return this;
	}

	@Override
	public String toString() {
		return "ClassDto [className=" + className + ", numberOfStudents=" + numberOfStudents + ", studentNames="
				+ studentNames + "]";
	}

}
