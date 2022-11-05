package bean;

/*
 * Class: KDL đối tượng
 * Class: có thể chứa nhiều thông tin
 * Class: Giá trị của class là đối tượng( ô nhớ HEAP)
 Mỗi đối tượng sẽ có giá trị của các thuộc tính riêng lẻ khác nhau
 Khai báo kiểu dữ liệu mặt hàng 
 ==> attributes(thuộc tính)
 	+ Mã mặt hàng
 	+ Tên mặt hàng
 	+ Giá bán
 */
public class Item {
	//non-static
	public int id;
	public String name;
	public double salesPrice;
	
	// Hàm khởi tạo mặc định
	// Khởi tạo ra một đối tượng cho class hieenh tại
	// ==> trả về KDL Item
	
	public Item() {
	}

	public Item(int pId, String pName, double pSalesPrice) {
		this.id = pId;
		this.name = pName;
		this.salesPrice = pSalesPrice;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + ", " + this.name + ", " + this.salesPrice ;
	}
}
