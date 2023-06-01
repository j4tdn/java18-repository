package b5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Student> students = new ArrayList<>();
        File file = new File("student.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(", ");
            String id = parts[0];
            String name = parts[1];
            double gpa = Double.parseDouble(parts[2]);
            String gender = parts[3];
            students.add(new Student(id, name, gpa, gender));
        }
        scanner.close();

        // a. Sort students by GPA in ascending order. If GPA is the same, sort by name in descending order.
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.gpa != s2.gpa) {
                    return Double.compare(s1.gpa, s2.gpa);
                } else {
                    return s2.name.compareTo(s1.name);
                }
            }
        });

        System.out.println("Sorted list of students:");
        for (Student student : students) {
            System.out.println(student.id + ", " + student.name + ", " + student.gpa + ", " + student.gender);
        }

        // b. Find students with GPA > 8
        ArrayList<Student> studentsWithHighGPA = new ArrayList<>();
        for (Student student : students) {
            if (student.gpa > 8) {
                studentsWithHighGPA.add(student);
            }
        }

        System.out.println("\nStudents with GPA > 8:");
        for (Student student : studentsWithHighGPA) {
            System.out.println(student.id + ", " + student.name + ", " + student.gpa + ", " + student.gender);
        }

        // c. Find all female students
        ArrayList<Student> femaleStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.gender.equals("Nu")) {
                femaleStudents.add(student);
            }
        }

        System.out.println("\nFemale students:");
        for (Student student : femaleStudents) {
            System.out.println(student.id + ", " + student.name + ", " + student.gpa + ", " + student.gender);
        }

        // d. Find students that only appear once in student.txt
        ArrayList<Student> uniqueStudents = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < students.size(); j++) {
                if (i != j && students.get(i).id.equals(students.get(j).id)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueStudents.add(students.get(i));
            }
        }

        System.out.println("\nUnique students:");
        for (Student student : uniqueStudents) {
            System.out.println(student.id + ", " + student.name + ", " + student.gpa + ", " + student.gender);
        }
    }
}