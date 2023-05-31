package Ex05.view;

import java.nio.file.Path;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

import Ex05.Utils.FileUtils;
import Ex05.bean.Student;

public class Ex05 {
	
	private static String pathname = "C:\\Users\\HP\\Desktop\\JAVA18\\2.JAVA\\lesson15_tuongvy\\src\\Ex05\\student.txt";

	public static void main(String[] args) {
		List<Student> students = FileUtils.readFile(Path.of(pathname), Student::transfer);
		System.out.println(students);
		
		
		System.out.println("1:");
		print1(students);

		System.out.println("2:");
		print2(students);

		System.out.println("3:");
		print3(students);

		System.out.println("4:");
		print4(students);

		
	}
	
	public static void print1(List<Student> students) {
        students.stream()
                .sorted(Comparator.comparing(Student::getGpa).thenComparing(Student::getName).reversed())
                .forEach(System.out::println);
    }

    public static void print2(List<Student> students) {
        students.stream()
                .filter(student -> student.getGpa() > 8)
                .forEach(System.out::println);
    }

    public static void print3(List<Student> students) {
        students.stream()
                .filter(student -> student.getGender().equals("Nu"))
                .forEach(System.out::println);
    }

    public static void print4(List<Student> students) {
        students.stream()
                .filter(distinctByKey(Student::getId))
                .forEach(System.out::println);
    }

    public static <T, R> Predicate<T> distinctByKey(Function<T, R> func) {
        Set<R> set = new HashSet<>();
        return t -> set.add(func.apply(t));
    }
}
