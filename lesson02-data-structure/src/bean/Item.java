package bean;

/*
 * Class : KDL đối tượng
 * CLass : Có thể chưa nhiều thông tin
 * Class : Giá trị của class là đối tượng (ô nhớ HEAP)
 * Mỗi đối tượng sẽ có giá trị các thuộc tính khác nhau 
 * Khai báo KDL Item() gồm 
 * ==> Attributes ( thuộc tính )
 * Id, Name, Price
 * */
public class Item {
	public int id;
	public String name;
	public double sellPrice;
	
	// Hàm "khởi tạo" mặc định
	// Khởi tạo ra một đối tượng cho class hiện tại
	// ==> Trả về KDL Item
	//	public Item() {
	//		
	//	}
	
	// External : Item i4 = new Item(345, "Item C345", 30)
	public Item(int id, String name, double sellPrice) {
		this.id = id;
		this.name = name;
		this.sellPrice = sellPrice;
	}
	
	@Override // định nghĩa lại từ class cha
	public String toString() {
		// TODO Auto-generated method stub
		// this : object, biến đối tượng hiện tại đang gọi đến toString
		return this.id + ", " + this.name + ", " + this.sellPrice;
	}
}
