package homework1;

public class AppStudent {
	public static void main(String[] args) {
		int step = 0;
		Student sv1 = new Student(1, "Quý", 7, 8);
		Student sv2 = new Student(2, "Đạt", 10, 8);
		Student sv3 = new Student();
		sv3.setId(3);
		sv3.setName("Dũng");
		sv3.setPractice(10);
		sv3.setTheory(8);
		Student[] students = { sv1, sv2, sv3 };
		System.out.println("Sinh viên có điểm trung bình trên 8.5 là :");
		for (Student student : students) {
			if (Scoring.ScoringDTB(student) >= 8.5) {
				System.out.println(student);
				step++;
			}
		}
		if (step == 0) {
			System.out.println("không có");
			step = 0;
		}
		System.out.println("Sinh viên có điểm Lý Thuyết hơn điểm thực hành là :");
		for (Student student : students) {
			if (student.getPractice() > student.getTheory()) {
				System.out.println(student);
			}

		}
		if (step == 0) {
			System.out.println("không có");
			step = 0;
		}
	}
}
