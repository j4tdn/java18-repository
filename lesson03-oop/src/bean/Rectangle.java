package bean;

public class Rectangle {
	// attribute - thuộc tính
	// --> thông tin của 1 class chứa nó

	// khi tạo ra 1 object(giá trị của class) thông qua hàm khởi tạo thì
	// --> tạo 1 ô nhớ ở HEAP và ô nhớ đó chứa giá trị mặc định của các thuộc tính
	// trong class

	// non-static ==> đối tượng
	// static ==> class(objects)
	public int width;
	public int height;

	// constructor -- default
	// --> tạo ra(khởi tạo) đối tượng(giá trị) cho biến thuộc KDL class này --> new
	public Rectangle() {
	}

	// r1.toString(), r2.toString()
	// this --> biến (đối tượng) hiện tại đang gọi function
	
	@Override
	public String toString() {
		return "w" + this.width + ", " + "h" + this.height;}
	} 
// 2:01:23
	
