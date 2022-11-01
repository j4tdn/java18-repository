package bean;

/*
 * Class : KDL đối tượng
 * Class : có thể chứa nhiều thông tin
 * Class : giá trị của class là đối tượng(ô nhớ ở HEAP)
 * Mỗi đối tượng sẽ có giá trị của các thuộc tính khác nhau
 *khai báo kiểu dữ liệu mặt hàng gồm
 *==> attributes (thuộc tính)
 * + mã đặt hàng
 * + tên mặt hàng
 * + giá bán 
 *
 */

public class Item {
	// non-static
	public int id;
	public String name;
	public double salesPrice;
	
	//Hàm: public static int sum()
	
	//hàm "khởi tạo" mặc định
	//khởi tạo ra một đối tượng cho class hiện tại
	//==> trả về KDL Item
	
	public Item() {
		
		
	}
	
	//external: Item  i4 = new Item(345, "Item C345" , 30);
	public Item(int pId, String pName, double pSalesPrice) {
		this.id = pId;
		this.name = pName;
		this.salesPrice = pSalesPrice;
	}
	@Override //  đang định nghĩa lại từ cha
	//this:  là biến đối tượng hiện tại đang gọi toString
	public String toString() {

		return this.id + ", " + this.name + ", " +this.salesPrice;
	}
}
