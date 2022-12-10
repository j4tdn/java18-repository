package ex01;

public class Student {
private int id;
private String name;
private float theoryMark;
private float practiceMark;


public Student(int id, String name, float theoryMark, float practiceMark) {
	super();
	this.id = id;
	this.name = name;
	this.theoryMark = theoryMark;
	this.practiceMark = practiceMark;
}


public Student() {
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


public float getTheoryMark() {
	return theoryMark;
}


public void setTheoryMark(float theoryMark) {
	this.theoryMark = theoryMark;
}


public float getPracticeMark() {
	return practiceMark;
}


public void setPracticeMark(float practiceMark) {
	this.practiceMark = practiceMark;
}

public float diemtb(float theoryMark, float practiceMark) {
	return ((this.theoryMark + this.practiceMark)/2);
}
@Override
public String toString() {
	return " id=" + id + ", name=" + name + ", theoryMark=" + theoryMark + ", practiceMark=" + practiceMark
			 ;
}



}
