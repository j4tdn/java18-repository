package singleton;

public class SingletonClass {
	private static SingletonClass instance = null;

	int value;

	private SingletonClass() {
	}

	public static SingletonClass getInstance() {
		if (instance == null) {
			instance = new SingletonClass(); // H1
		}
		return instance;

	}
}
