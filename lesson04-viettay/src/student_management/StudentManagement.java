package student_management;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 Bài 1:  	Viết chương trình OOP quản lý sinh viên đơn giản: Nhập xuất thông tin, tính điểm TB.
			Tạo lớp Sinh viên như sau:
			Attributes (private):
			Mã sinh viên là số nguyên.
			Họ tên: chuỗi ký tự.
			Điểm LT, điểm TH : float
			Constructor:
			
			Constructor mặc định (để khởi tạo đối tượng với các thông tin kiểu số là 0, kiểu chuỗi
			là chuỗi rỗng).
			Constructor thứ hai nhận đầy đủ thông tin để khởi tạo giá trị cho tất cả các biến
			instance.
			Methods:
			
			Các phương thức getter và setter cho mỗi thuộc tính.
			Tính điểm trung bình.
			Phương thức toString để diễn tả thông tin của đối tượng ở dạng chuỗi.
			
			Xây dựng class chứa hàm main: tạo 3 đối tượng sinh viên sv1, sv2, sv3, trong đó:
			1. sv1 chứa thông tin của chính mình (tạo bằng constructor đủ thông số, thông tin biết rồi
			khỏi nhập từ bàn phím).
			2. sv2 là thông tin người bạn thân nhất của em (tạo bằng constructor đủ thông số, thông tin
			biết rồi khỏi nhập từ bàn phím).
			3. sv3 tạo bằng constructor mặc định. Tạo hàm nhập các thông tin cho sv3 từ bàn phím sau
			đó dùng setter để gán các thuộc tính tương ứng.
			4. Viết hàm tìm thông tin sinh viên có điểm trung bình lớn hơn 8.5
			5. Viết hàm tìm thông tin sinh viên có điểm LT lớn hơn điểm TH
 *
 */
public class StudentManagement {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		Student s1 = new Student(1, "Viet Tay", 5.5f, 6.6f);
		Student s2 = new Student(2, "Tuan Kiet", 9.9f, 8.8f);

		Student s3 = new Student();
		System.out.println("====Enter informantion for student=====\n");
		System.out.print("Enter StudentID: ");
		s3.setId(Integer.parseInt(ip.nextLine()));
		System.out.print("Enter Name Student: ");
		s3.setName(ip.nextLine());
		System.out.print("Enter Mark LT: ");
		s3.setMarkLT(ip.nextFloat());
		System.out.print("Enter Mark TH: ");
		s3.setMarkTH(ip.nextFloat());

		Student[] students = { s1, s2, s3 };
		System.out.println("\nSinh viên có điểm trung bình lớn hơn 8.5:\n" + Arrays.toString(look1(students)));
		System.out.println("\nSinh viên có điểm LT lớn hơn điểm TH:\n" + Arrays.toString(look2(students)));
	}

	private static Student[] look1(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student : students) {
			if (student.calGPA() > 8.5f) {
				result[count] = student;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static Student[] look2(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for (Student student : students) {
			if (student.getMarkLT() > student.getMarkTH()) {
				result[count] = student;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

}
