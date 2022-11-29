package bean;

public class Rectangle {
	//attribute
	//--> thông tin của class chứa nó khi tạo ra 1 object(giá trị của class) thông qua hàm khởi tạo
	//--> tạo 1 ô nhớ heap và ô nhớ đó chứa giá trị mặc dịnh của các thuộc tính trong class
	private int width;
	private int height;
	
	//constructor
	//--> khởi tạo giá trị cho biến thuộc KDL class này, tạo ra ô nhớ và gán giá trị cho các thuộc tính
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//setter --> (thay đổi 1/toàn phần) giá trị của thuộc tính (private)
	//getter --> (lấy 1/toàn phần) giá trị của thuộc tính(private)

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
		return "width: "+this.width+" ============= height: "+this.height;
	}

}
