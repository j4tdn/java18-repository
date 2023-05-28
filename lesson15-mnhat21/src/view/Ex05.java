package view;

import bean.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class Ex05 {
    public static void main(String[] args) {
        List<Student> students = readFile("Student");

        // Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu ĐTB bằng nhau sắp xếp giảm
        // dần theo họ tên.
        List<Student> req1 = students;
        req1.sort((o1, o2) -> {
            if (o1.getScore() == o2.getScore()){
                return o2.getName().compareTo(o1.getName());
            }
            return Double.compare(o1.getScore(), o2.getScore());
        });

        // Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8
        List<Student> req2 = students;
        req2.stream().filter(student -> student.getScore() > 8d).collect(Collectors.toList());

        // Viết hàm tìm kiếm toàn bộ các sinh viên NỮ
        List<Student> req3 = students;
        req3.stream().filter(student -> student.getGender().equals("Nu")).collect(Collectors.toList());

        // Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được
        // phân biệt với nhau thông qua MSSV
        Set<Student> uniqueId = new HashSet<>();
        List<Student> uniqueStudent = students.stream().filter(student -> uniqueId.add(student)).collect(Collectors.toList());

    }

    private static List<Student> readFile (String fileName){
        List<Student> students = new ArrayList<>();

        try {
            File file = new File(fileName + ".txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(", ");

                String id = data[0];
                String name = data[1];
                double score = Double.parseDouble(data[2]);
                String gender = data[3];

                Student student = new Student(id, name, score, gender);
                students.add(student);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        return students;
    }
}
