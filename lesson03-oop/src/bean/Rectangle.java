package bean;

public class Rectangle {
	// attribue - thuộc tính
	// --> thông tin của class chứa nó
	// Khi tạo ra 1 object (giá trị của class)
	// thông qua hàm khơi tạo thì
	// --> tạo 1 ô nhớ ở HEAP và
	// ô nhớ đó chứa giá trị mặc định của các
	// thuộc tính trong class

	// non-static : object
	// static : class (object)
	public int width;
	public int height;

	// constructor -- default
	// --> tạo ra (khởi tạo) đối tượng (giá trị) cho biến
	// thuộc KDL class này --> new
	public Rectangle() {

	}
	// Tạo ra ô nhớ và gán gái trị cho các thuộc tính của
	// đối tượng - với tham số truyền bên ngoài vào
	// Rectangle r3= new Rectangle(20,10);
	// int width = 20;
	// int height = 10;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// public method
	// setter --> set (thay đổi 1/ toàn phần) giá trị của thuộc tính(private)
	// getter --> get (lấy ra 1/ toàn phần) giá trị của thuộc tính (private)

	// r1.with = 10;

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

	// r1.toString(), r2.toString()
	// this --> biến (đối tượng) hiện tại đang gọi function
	@Override
	public String toString() {
		return "w" + this.width + ", " + "h" + this.height;
	}
}
