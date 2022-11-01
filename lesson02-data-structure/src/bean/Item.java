package bean;
/*
 * class : kdl đối tượng 
 * class : có thể chứa nhiều thông tin
 * class : giá trị của class là đối tượng (ô nhớ ở heap)
 *  Mỗi đối tượng sễ có giá trị của các thuộc tính khác nhau
 khai báo kiểu dữ liệu item(class) gồm
 => attributes(thuộc tính) 
 - mã mặt hàng
 - tên mặt hàng
 - giá bán 
 */
public class Item {
//	tất cả là non-static
	public int id;
	public String name;
	public double salesPrice;
	
//	hàm khởi tạo mặc định dùng để khởi tạo đối tượng cho class hiện tại
//	=> thuộc kiểu dữ liệu của class hiện tại
//	=>trả về KDL Item
	
	
//	public Item()
//	{
//		
//	}
	public Item(int pId, String pname, double pSaleprice)
	{
		this.id  = pId;
		this.name = pname;
		this.salesPrice = pSaleprice;
	}
	@Override // định nghĩa lại từ cha
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + "," + this.name + "," + this.salesPrice;
	}

}
