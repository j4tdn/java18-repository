package bean;

/*
 Khai báo KDL mặt hàng (class) gồm 
 	↓ attributes (thuộc tính)
 	+ Mã mặt hàng 
 	+ Tên mặt hàng 
 	+ Giá bán
 */
public class Item {
	// non-static
	public int id;
	public String name;
	public double salesPrice;
	
	// Hàm "khởi tạo" mặc định
	// Mục đích: khởi tạo ra một đối tượng cho Class hiện tại
	// ==> thuộc kiểu dữ liệu của Class hiện tại (tức trả về KDL Item)
	
	public Item() {	
		
	}
	
	// external: 
	public Item(int pId, String pName, double pSalesPrice) {
		this.id = pId;
		this.name = pName;
		this.salesPrice = pSalesPrice;
	}

	@Override // (định nghĩa lại từ Cha)
	// this: biến đối tượng hiện tại đang gọi toString
	public String toString() {
		return this.id + ", " + this.name + ", " + this.salesPrice;
	}

}
