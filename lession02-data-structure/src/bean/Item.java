package bean;

/*
 * Class: KDL đối tượng
 * Class: Có thể chứa nhiều thông tin
 * Class: Giá trị của class là đối tượng (ô nhớ ở HEAP)
 * Mỗi đối tượng sẽ có giá trị của các tt khác nhau 
 * Khai báo kiểu dữ liệu mặt hàng gồm:
 * 	==> attributes(thuộc tính)
 * + mã mặt hàng
 * + tên mặt hàng
 * + giá bán
 */
public class Item {
	// non-static
	public int id;
	public String name;
	public double salesPrice;
	
	// Hàm: public static int sum()
	
	// Hàm "khởi tạo" mặc định
	// Khởi tạo ra một dối tượng cho class hiện tại
	// ==> trả về KDL Item
	/*
	 * public Item() {
	 * 		
	 * }
	 * 
	 * External: Item i4 = new Item(345, "Item C345", 30);
	 */
	public Item(int id, String name, double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}
	@Override // (định nghĩa lại từ cha)
	// this: biến đối tượng hiện tại đang goi toString
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + ", " + this.name + ", " + this.salesPrice;
	} 
}

