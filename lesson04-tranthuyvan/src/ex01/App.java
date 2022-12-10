package ex01;

/**
 * Xây dựng class chứa hàm main: tạo 3 đối tượng sinh viên sv1, sv2, sv3, trong đó:
 * 1. sv1 chứa thông tin của chính mình (tạo bằng constructor đủ thông số, thông tin biết rồi
	  khỏi nhập từ bàn phím).
 * 2. sv2 là thông tin người bạn thân nhất của em (tạo bằng constructor đủ thông số, thông tin
	  biết rồi khỏi nhập từ bàn phím).
 */

public class App {
	public static void main(String[] args) {
		Student s1 = new Student(123, "Nguyen Van A", 6.5f, 8f);
		Student s2 = new Student(234, "Tran Thi B", 9.5f, 8.5f);
		Student s3 = StudentUtils.inputInfor();

		Student[] students = { s1, s2, s3 };

		System.out.println("----- Information of all students -----");
		StudentUtils.showAllStudents(students);

		System.out.println("----- Students with a GPA greater than 8.5 -----");
		StudentUtils.findStudentWithGPA(students);

		System.out.println("----- Students whose theoretical point is greater than practice point -----");
		StudentUtils.theoPointIsGreaterThanPracPoint(students);

	}

}
