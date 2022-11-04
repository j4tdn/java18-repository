package bean;


/*
 * Class: KDL doi tuong
 * Class: co the chưa nhiều thông tin
 * Class: giá trị của class là đối tượng ( ô nhớ ở Heap)
 * Mỗi đối tượng sẽ có giá trị của các thuộc tính riêng lẻ khác nhau.
 * 
 Khai báo kiểu dữ liệu mặt hàng (Class) gồm: 
 	==> Attributes (thuộc tính) 
 	+ mã mặt hàng,
 	+ Tên mặt hàng
 	+ giá bán
 */
public class Item {
	// non-static
	public int id;
	public String name;
	public double salesPrice;
	
	//Hám: public static int sum()
	
	// Hàm "khởi tạo" mặc đinh
	// Khởi tạo ra 1 đối tượng cho class hiện tại
	//=> Trả về KDL Item
	// Hàm khởi tạo trùng tên class
	
	public Item() {
		
	}
	
	
	// external: Item i4 = new Item(345, "Item C345", 30)
	public Item(int pId, String pName, double pSalesPrice) {
		this.id = pId;
		this.name = pName;
		this.salesPrice = pSalesPrice;
	}
	
@Override // (định nghĩa lại từ cha)
	//i1.
	
	
	
	
	// this : biến đối tượng hiện tại đang gọi toString

public String toString() {
	return this.id + ", " + this.name + ", " + this.salesPrice;
}
}
