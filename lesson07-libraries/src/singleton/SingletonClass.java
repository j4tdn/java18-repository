package singleton;

/**
 *  Để static vì static thuộc phạm vi của class
 *  Non-static thuộc phạm vi của scope
 *  Khi lấy class chấm hàm thì phải tạo đối tượng mới 
 *  Nhưng mục đích của mình là singleton
 *  =====================================
 *  
 *  
 *
 */
 

public class SingletonClass {
	// duy nhất instance của this class
	private static SingletonClass instance = null;
	
	int value;
	 
	private SingletonClass() {
		
	}
	public static SingletonClass getInstance() {
		if (instance == null) {
			instance = new SingletonClass();
		}
		return instance;
	}
}
	
