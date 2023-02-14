package singleton;

public class SingletonClass {
	// unique instance of this class 
	private static SingletonClass instance = null;
	
	int value;
	
	private SingletonClass() {
		
	}
	
	// purpose: to create only an object
	public static SingletonClass getInstance() {
		if (instance == null) {
			instance = new SingletonClass();
		}
		return instance;
	}

}
