import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class StudentInfo {
    
	public static void main(String[] args) {
        List<Student> studentList = readFile("student.txt");
        System.out.println("Danh sach sinh vien goc:");
        displayStudents(studentList);

        System.out.println("\nDanh sach sinh vien sap xep theo DTB va ho ten:");
        sortByDTBAndName(studentList);
        displayStudents(studentList);

        List<Student> topStudentList = filterTopStudents(studentList, 8.0);
        System.out.println("\nDanh sach sinh vien co DTB > 8:");
        displayStudents(topStudentList);

        List<Student> femaleStudentList = filterFemaleStudents(studentList);
        System.out.println("\nDanh sach sinh vien nu:");
        displayStudents(femaleStudentList);

        List<Student> uniqueStudentList = filterUniqueStudents(studentList);
        System.out.println("\nDanh sach sinh vien chi xuat hien mot lan:");
        displayStudents(uniqueStudentList);
    }

    public static List<Student> readFile(String filePath) {
        List<Student> studentList = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            while (line != null) {
                String[] parts = line.split(",");
                String mssv = parts[0].trim();
                String hoTen = parts[1].trim();
                double diemTB = Double.parseDouble(parts[2].trim());
                String gioiTinh = parts[3].trim();
                Student student = new Student(mssv, hoTen, diemTB, gioiTinh);
                studentList.add(student);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    public static void displayStudents(List<Student> studentList) {
        System.out.println("MSSV, Ho ten, Diem TB, Gioi tinh");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public static List<Student> sortByDTBAndName(List<Student> studentList) {
        Comparator<Student> dtbComparator = Comparator.comparingDouble(Student::getDiemTB)
                                                          .reversed();
        Comparator<Student> nameComparator = Comparator.comparing(Student::getHoTen);
        studentList.sort(dtbComparator.thenComparing(nameComparator));
        return studentList;
    }

    public static List<Student> filterTopStudents(List<Student> studentList, double threshold) {
        List<Student> topList = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getDiemTB() > threshold) {
                topList.add(student);
            }
        }
        return topList;
    }

    public static List<Student> filterFemaleStudents(List<Student> studentList) {
        List<Student> femaleList = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getGioiTinh().equalsIgnoreCase("nu")) {
                femaleList.add(student);
            }
        }
        return femaleList;
    }

    public static List<Student> filterUniqueStudents(List<Student> studentList) {
        List<Student> uniqueList = new ArrayList<>();
        Map<String, Integer> countMap = new HashMap<>();
        for (Student student : studentList) {
            String key = student.getMssv();
            countMap.put(key, countMap.getOrDefault(key, 0) + 1);
        }
        for (Student student : studentList) {
            String key = student.getMssv();
            if (countMap.get(key) == 1) {
                uniqueList.add(student);
            }
        }
        return uniqueList;
    }
    
}
