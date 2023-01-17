package singleton;

/*
 * là 1 class chỉ tạo duy nhát 1 giá trị đối tượng. Nếu tạo 100 cái thì 100 dối tượng đó mang cùng 1 giá trị
 */
public class SingletonDemo {
	public static void main(String[] args) {
		SingletonClass s1 = SingletonClass.getInstance();
		System.out.println("s1 code: " + System.identityHashCode(s1));
		s1.value = 99;
		System.out.println("S1: " + s1.value);

		SingletonClass s2 = SingletonClass.getInstance();
		System.out.println("s2 code: " + System.identityHashCode(s1));
		System.out.println("S2: " + s2.value);
	}
}
