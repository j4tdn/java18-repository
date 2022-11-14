package bean;

public class Rectangle {
	// attribue - thuộc tính
		// --> thông tin của classs chứa bó
		// khi tạo ra 1 object(giá trị của class)
		// thông qua hàm khởi tạo thì
		// --> tạo 1 ô nhớ ở HEAP và ô nhớ đó chứa giá trị mặc định của các thuộc tính
		// trong class

		// non-static ==> object
		// static ==> class(objects)
		//private ==> ÔP idea --> ngăn cản quyền truy cập
		//trực tiếp(biếc chính xác thông tin bên trong) từ bên ngoài
		
		
		public int width;
		public int height;

		// con structor -- default
		// -- tạo ra(khởi tạo dối tượng(giá trị) cho biến thuộc KDL class này
		public Rectangle() {

		}
		
		// constructor
		//tạo ra ô nhớ và gán giá trị cho các thuộc tính của
		// đối tượng - với tham số truyền bên ngoài vào
		// Rectangle r3 = new Rectangle(20,10);
		//int width = 20;
		//int height = 10;
		public Rectangle(int width, int height) {
			this.width = width;
			this.height = height;
			
		}
		public void setWidth(int with) {
			this.width = with;
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
		//public method
		//setter --> set(thay đổi-1/ toàn phần) giá trị của thuộc tính(private)
		//getter --> get( lấy 1/ toàn phần) giá trị của thuộc tính(
		
		// r1.toString(), r2.toString()
		//this --> biến(đối tượng)
		@Override
		public String toString() {
			return "w" + this.width + "," + "h" + this.height;
		}
}
