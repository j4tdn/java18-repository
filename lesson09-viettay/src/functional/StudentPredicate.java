package functional;

import bean.Student;

@FunctionalInterface
public interface StudentPredicate {
	boolean test(Student student);
}
