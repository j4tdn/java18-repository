package been;

public class Rectangle {
	// attribute - thuoc tinh
	// thuộc tính là thông tin của class chứa nó
	// Khi tạo ra 1 object(giá trị của class) thông qua hàm khởi tạo thì nó
	// sẽ tạo ra 1 ô nhớ HEAP và ô nhớ đó chứa giá trị mặc định của các thuộc tính
	// trong class

	// non-static ==> object
	// static ==> class(objects)
	private int width;
	private int height;

	// constructor -- default (hàm khởi tạo đối tượng cho class này)
	// --> tạo ra (khởi tạo) đối tượng(giá trị) cho biến
	// thuộc KDL class này ---> new
	public Rectangle() {
	}

	// constructor cũng là hàm khởi tạo
	// tọa ra ô nhớ và gán giá trị cho các thuộc tính của đối tượng
	// với tham số truyền từ bên ngoài vào
	// Rectangle r3 = new Rectanglr(20,);
	// int pwidth = 20;
	// int pheight =10;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	//public method
    // setter ==> set(thay đổi) giá trị của thuộc tính (Private)
	//getter  ==> get(laatys 1/ toàn phần) giá trị của thuộc tính (private)
	
	// r1.width = 10;
	public void setWidth(int with) {
		this.width = with;
	}
	// r1.width
	public int getWidth() {
		return this.width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return this.height;
	}
	// lúc thì r1.toString lúc thì r2.toString
	// để biết được thì
	// this -->biến ( đối tượng) hiện tại đang gọi là functione
	// this ô nhớ trên HEAD
	@Override
	public String toString() {
		return "w" + this.width + "," + "h" + this.height;

	}
}
