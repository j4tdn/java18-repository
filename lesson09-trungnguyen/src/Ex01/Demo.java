package Ex01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		Student[] students = createData();
		Student[] studentAscore = getStudentAscore(students);
		System.out.println(Arrays.toString(studentAscore));
		
		Student[] stdentRestudy = getStudentRestudy(students);
		
		
	}
	
	private static Student[] createData() {
		Student s1 = new Student(102, "Nam", 'C');
		Student s2 = new Student(103, "Hoang", 'D');
		Student s3 = new Student(104, "Nguyen", 'B');
		Student s4 = new Student(105, "Vu", 'F');
		Student s5 = new Student(107, "Lan", 'C');
		Student s6 = new Student(109, "Dat", 'A');
		Student s7 = new Student(202, "Bao", 'F');
		Student s8 = new Student(103, "Nam", 'C');
		Student s9 = new Student(107, "Vu", 'C');
		Student s10 = new Student(104, "Hoang", 'C');
		
		Student[] students = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
		return students;
	}
	private static Student[] getStudentAscore(Student[] students) {
		Student[] result1 = new Student[students.length];
		int count = 0;
		for(Student student: students) {
			if (student.getScore()=='A') {
				result1[count]=student;
				count++;
			}
		}
		return Arrays.copyOfRange(result1, 0, count);
		
	}
	private static Student[] getStudentRestudy(Student[] students) {
		Student[] result2 = new Student[students.length];
		int count = 0;
		for(int i=0;i<=students.length;i++) {
			for(int j=i+1;j<=i;j++) {
				if (students[i].getNos()== students[j].getNos()) {
					result2[count]=students[i];
					count++;
				}
			}
		}
		return Arrays.copyOfRange(result2, 0, count);
		
	}
	
	

}
