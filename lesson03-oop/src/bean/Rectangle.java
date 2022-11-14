package bean;

public class Rectangle {
	//attribute - thuộc tính
	//--> thông tin của class chứa nó
	//Khi tạo ra q object (Giá trị của class)
	//thong qua hàm khởi tạo thì
	//tạo ra ô HEAP và ô nhớ chứa giá trị mặc định của các thuộc tính
	
	//non-static ==> object
	//staic      ==> class(objects)
	private int width;
	private int height;
	
	//constructor --default
	// --> tạo ra đối tượng (giá trị) cho biến thuộc kiểu dữ liệu class
	public Rectangle() {
		
	}
	
	
	// COntructor
	//Tạo ra  ô nhớ và gắn giá trị các thuộc tính của đối tượng thuộc KDL class này
	//--> với tham số truyền từ bên ngoài vào
	//
	public Rectangle( int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//public method
		// setter --> set( thay đổi 1/toàn phần ) giá trị của thuộc tính (private)
		// getter --> grt( lấy 1/ toàn phần ) giá trị của thuộc tính (private)
	
	
	// r1.toString(), r2.toString()
	// this -> Biến đối tượng hiện tại đang gọi function
	@Override
	public String toString() {
		return "w" + this.width + ", " + "h" + this.height;
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
}