package bean;

/*
 * Class: KDL đối tượng
 * Class: có thể chứa nhiều thông tin
 * Class: giá trị của class là đối tượng(ô nhớ ở HEAP)
 * Mỗi đối tượng sẽ có giá trị của các tt khác nhau
 khai báo kiểu dữ liệu mặt hàng(class) gồm 
 	==> attributes(thuộc tính)
 	+ mã mặt hàng
 	+ tên mặt hàng
 	+ giá bán
 */
public class Item {
	//non-static
	public int id;
	public String name;
	public double salesPrice;
	
	//Hàm "khới tạo" mặc định
	//khỏi tạo ra 1 đối tượng cho class hiện tại
	//==> trả về KDL Item
	
	//External: Item i4 = new Item(345,"Item C345",30);
	public Item() {
		
	}
	public Item(int id, String name, double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}
	
	@Override//định nghĩa lại
	public String toString() {
		return this.id + ", " + this.name +", " + this.salesPrice;
	}
}
