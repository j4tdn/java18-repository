package bean;

public class Student {
	private int idStudent;
	private String name;
	private char mark;

	public Student(int idStudent, String name, char mark) {
		this.idStudent = idStudent;
		this.name = name;
		this.mark = mark;
	}

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getMark() {
		return mark;
	}

	public void setMark(char mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Sinh viên " + this.name + " mã " + this.idStudent + " có số điểm là " + this.mark;
	}
}
