package bean;

public class Rectangle {
	// attribute -- thuoc tinh
	// thong tin cua class chứa nó 
	// khi tạo ra 1 object ( giá trị của class)
	// thông qua hàm khởi tạo thì 
	// --> nó sẽ tạo 1 ô nhớ ở HEAP và ô nhớ đó chứa giá trị mặc định của các thuộc tính trong class
	
	// non-static --> thuộc phạm vi object
	// static ---> thuộc phạm vi class ( object)
	
	private int width;
	private int height;
	
	//constructor -- default
	// ham khởi tạo : tạo ra đối tượng ( giá trị) cho biến thuộc KDL Class này --> new
	public Rectangle() {
		
	}
	
	//constructor
	// tạo ra ô nhớ và gán giá trị acho các thuộc tính cảu đôi stuowngj - với tham số truyền bên ngoài vào 
	// Rectangle r3 = new Rectangle(20,10);
	// int width = 20;
	// int height = 10; 
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//public method
	// setter --> set( thay đổi 1/toàn phần) giá trị của thuộc tính (private)
	// getter --> get ( lấy 1/ toàn phần) giá trị của thuộc tính (private)
	
	//r1.width = 10
	public void setWidth(int width) {
		this.width = width;
	}
	
	//r1.width
	public int getWidth() {
		return this.width;
	}
	
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	
	// r1.toString() , r2.toString()
	//this --> bieenr ( dodoi tuong) hien tai dang goi function
	@Override
	public String toString() {
		return "w" + this.width + ", " + "h" + this.height;
	}
}
