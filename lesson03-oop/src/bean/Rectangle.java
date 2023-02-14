package bean;

public class Rectangle {
	// attributes
	// --> thông tin của một Class chứa nó
	// Khi tạo ra 1 object (giá trị của class)
	// thông qua hàm khởi tạo thì tạo một ô nhớ trên HEAP và 
	// ô nhớ đó chứa giá trị mặc định của thuộc tính trong class
	
	// non-static ==> object 
	// static ==> class (objects)
	// private --> OOP idea --> ngăn cản quyền truy cập trực tiếp từ bên ngoài
	private int width;
	private int height;
	
	// constructor -- default
	// --> tạo ra (khởi tạo) đối tượng (giá trị) cho biến thuộc KDL Class này
	// --> new
	public Rectangle() {
	}
	
	// constructor
	// tạo ra ô nhớ và gán giá trị cho các thuộc tính của đối tượng
	// với tham số truyền bên ngoài vào 
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// public method
	// setter --> set (thay đổi 1/ toàn phần giá trị của thuộc tính) (private)
	// getter --> get (lấy 1/ toàn phần giá trị của thuộc tính) (private)

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// this --> biến (đối tượng hiện tại đang gọi function) --> ô nhớ trên HEAP
	@Override
	public String toString() {
		return "w" + this.width + ", " + "h" + this.height;
	}

}
