package singleton;

public class SingletonClass {
	// unique instance of this class
	private static SingletonClass instance = null;
	
	int value;
	
	private SingletonClass() {
		
	}
	
	static SingletonClass getInstance() {
		// taọ ra một đối tượng duy nhất
		if (instance == null) {
			instance = new SingletonClass();
		}
		return instance;
	}
}
