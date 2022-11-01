package bean;

/*
 * Class: KDL đối tượng
 * Class: Có thể chứa nhiều thông tin
 * Class: Giá trị của class là đối tượng(ô nhớ ở HEAP)
 * Mỗi đối tượng sẽ có giá trị của các thuộc tính khác nhau
 Khai báo kiểu dữ liệu mặt hàng gồm:
  ==> attributes(thuộc tính)
  + mã mặt hàng
  + tên mặt hàng
  + giá bán
 */
public class Item {
	
	// non-static
	public int id;
	public String name;
	public Double salesPrice;
	
	// Hàm: public static int sum()
	
	// Hàm "khởi tạo" mặc định
	// Khởi tạo ra 1 đối tượng cho class hiện tại
	// => trả về KDL Item
	public Item() {
		
	}
	
	// external: Item i4 = new Item(345, "Item C345", 30)
	public Item(int pId, String pName, double pSalesPrice) {
		this.id = pId;
		this.name = pName;
		this.salesPrice= pSalesPrice;
	}
	@Override //(định nghĩa lại từ cha)
	// i1.toString()
	// i2.toString()
	// i3.toString() ==> id=234
	// i4.toString() ==> id=345
	// id, name, salesPrice
	// this: biến đối tượng hiện tại đang gọi toString
	public String toString() {
		return this.id + ", " + this.name + ", " + this.salesPrice;
		// TODO Auto-generated method stub
	}
}
