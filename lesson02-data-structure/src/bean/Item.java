package bean;

/* Class: KDl đói tượng
 * Class: Có thể chứa nhiều thông tin
 * Class: Giá trị của class là đối tương (ô nhớ ở HEAP
 * Mỗi đuối tượng sẽ có giá trị của các tt khác nhau
 * */
/*
 * Khai báo kiểu dữ liệu mặt hàng(class) gồm:
 * --> attribute (thuộc tính)
 * + Mã hàng
 * + Tên hàng
 * + Giá bán
 * */
public class Item {
	//non-static
	public static int id;
	public static String name;
	public static double salesPrice;
	//Hàm khởi tạo mặc định
	//Một hàm có tối thiểu tên hàm và kdl trả về
	//Hàm khởi tạo tạo ra một đối tượng cho class hiện tại
	//--> Trả về KDL Item
	//Hàm khởi tạo bắt buộc phải trùng tên với class
	public Item(int id, String name, double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}
	/*
	public void printItem() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salesPrice);
		
	} */
	@Override // Tái định nghĩa lại từ cha
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + "," + this.name + "," + this.salesPrice;
	}
	//this --> biến đối tượng hiện tại đang gọi toString
}
