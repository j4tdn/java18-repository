package bean;

public class Rectangle {
	// attribute
	// -->thông tin của class chứa nó
	// khi tại ra 1 object(giá trị của class)
	// thông qua hàm khơi tạo thì
	// -->tạo một ô nhớ ở heap và mắc định ô nhớ đó chứa giá trị mặc định của các
	// thuộc tính trong class
	// non static ==>object
	// static ==> class(object)

	// private -->oop idea --> ngăn cản quyền truy cập
	// trực tiếp(biết chính xác tt bên trong)
	private int width;
	private int height;

	// public method
	// getter --> get(lấy 1/toàn phần) giá trị của thuộc tính (private)
	// setter --> set(thay đổi 1/toàn phần) giá trị của thuộc tính (private)

	// contructor -- default
	// --> tạo ra đối tượng (giá trị) cho biến
	// thuộc KDL class này
	public Rectangle() {

	}

	// contructer
	// tạo ra ô nhớ và gán giá trị cho các thuộc tính của
	// đối tượng - với tham số truyền bên ngoài vào
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;

	}

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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "w" + this.width + ", " + "h" + this.height;
	}
}
