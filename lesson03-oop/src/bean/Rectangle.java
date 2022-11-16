package bean;

public class Rectangle {
//	attribute - thuộc tính
//	thông tin của class chưa ní
//	khi tạo ra 1 object (giá trí của class)
//	thông qua hàm khởi tạo thì 
//	--> tạo 1 ô nhớ heap và ô nhớ đó chưa giá trị mặc định của các thuộc tính tong class
//	non-static => object
//	static => class
	private int width;
	private int heigth;
//	constructor -- default
//	 tạo ra đối tượng cho biến thuộc kiểu dữ liệu class này
	public Rectangle() {
		
		
	}
	public Rectangle(int width, int heigth)
	{
		
		this.width = width;
		this.heigth = heigth;
	}
	
//	setter -> "thay đổi" giá trị của thuộc tính (thường dùng ở private)
//	getter -> "lấy giá trị" của thuộc tính (thường dùng ở private)
	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return this.width;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	public int getHeigth() {
		return this.heigth;
	}
	
	
	
	
	
//	this -> biến đối tượng hiên tại đang gọi function
	@Override
		public String toString() {
			// TODO Auto-generated method stub
		return "w" + this.width + "," + "h"+ this.heigth;

		}
	
	
	
	
}
