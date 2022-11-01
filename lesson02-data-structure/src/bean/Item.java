package bean;

/*
 * Class: KDL đối tượng
 * Class: Có thể chứa nhiều thông tin
 * Clas: Giá trị của class là đối tượng (ô nhớ ở HEAP)
 * Mỗi đối tượng sẽ có giá trị của các thuộc tính riêng lẻ khác nhau
 Khai báo kiểu dữ liệu mặt hàng gồm mã mặt hàng (class)gồm
     ==> attributes (thuộc tính)
     + Mã mặt hàng
     + Tên mặt hàng
     + Gía bán
 */
public class Item {
	// non-static
	public int id;
	public String name;
	public double salesPrice;
	
	// Hàm: public static int sum ()
	
	// Hàm "khởi tạo" mặc định
	// Khởi tạo ra một đối tượng cho class hiện tại
	// ==> trả về KDL Item
	
	public Item () {
		
	}
		
	// external: Item i4 = new Item(345, "Item C345", 30);
	public Item(int pid, String pname, double psalesPrice) {
		this.id = pid;
		this.name = pname;
		this.salesPrice = psalesPrice;
	}
	
	@Override // (định nghĩa lại từ cha)
	// this: biến đối tượng hiện tại đang gọi toString
	public String toString() {
		return this.id + ", " + this.name + ", " + this.salesPrice + ", ";
	}
}
