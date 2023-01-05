package singleton;

public class SingletonClass {
	
	private static SingletonClass instance = null;
	
	int value;
	
	private SingletonClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonClass getInstance() {
		if(instance == null) {
			instance = new SingletonClass();
		}
		
		return instance;
	}
}
