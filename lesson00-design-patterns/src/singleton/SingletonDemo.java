package singleton;

public class SingletonDemo {
	public static void main(String[] args) {
		SingletonClass s1 = SingletonClass.getInstance();
		System.out.println("s1 code: " + System.identityHashCode(s1));
		s1.value = 99;
		System.out.println("s1  value: " + s1.value);
		
		SingletonClass s2 = SingletonClass.getInstance();
		System.out.println("s2 code: " + System.identityHashCode(s2));
		System.out.println("");
	}
}