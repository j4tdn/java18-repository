package bean;

public class Rectangle {
	// attribute thuộc tính
	// --> thông tin của class chứa nó
	// khi tạo ra 1 object ( giá trị của class )
	// đối tượng thông qua hàm khởi tạo thì
	// sẽ tạo 1 ô nhớ ở HEAP và ô nhớ ddos chứa gia trị mặc định của
	// của các thuộc tính trong class
	// private --> OOP ->> ngăn chặn quyền truy cập
	// trực tiếp từ bên ngoài
	private int width;
	private int height;
	// construc -- default
	// --> tạo ra đối tượng cho biến
	// KDL thuộc class này --> new
	


	public Rectangle() {
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void setWidth( int width) {
		this.width=width;
	}
	public int getWidth() {
		return this.width;
	}
	public void setHeight( int Height) {
		this.height=Height;
	}
	public int getHeight() {
		return this.height;
	}
	//public method
	// setter --> set(thay đổi -1 / toàn phần ) giá trị cuat thuộc tính ( private)
	// getter --> get ( lấy 1 / toàn bộ ) giá trị cuat thuộc tính (private)

	// r1.toString() , r1 .toString()
	// this --> biến (đối tượng hiện tại đang gọi function)
	@Override
	public String toString() {
		return "w" + this.width + ", " + "h" + this.height;
	}
}
