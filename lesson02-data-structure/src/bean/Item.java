package bean;


/*
 * Class: KDL đối tượng
 * Class: có thể chứa nhiều thông tin bên trong
 * Class: giá trị của class là đối tượng (ô nhớ ở )
 khai báo KDL mặt hàng () gồm
 ==>attributes(thuộc tính)
 +mã mặt hàng
 +tên mặt hàng
 +giá bán
 */
public class Item {
	public int id;
	public String name;
	public double salesPrice;
	public Item() {}

	public Item (int pID, String pName, double pSalesPrice) {
		this.id = pID;
		this.name = pName;
		this.salesPrice = pSalesPrice;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	// hàm "khởi tạo" mặc định
public static void main(String[] args) {
		
}
}
