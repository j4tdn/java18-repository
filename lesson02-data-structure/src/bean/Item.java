package bean;
// /* enter
/*
 * Class: KDL đối tượng
 * Class: Có thể chứa nhiều thông tin
 * Class: Giá trị của class là đối tượng ( ô nhớ ở HEAP)
 * Mỗi đối tượng sẽ có giá trị của các thuộc tính riêng lẽ khác nhau
 Khai báo kiểu dử liệu mặt hàng (class) gồm
 	=> atributes(thuộc tính)
 	+ mã mặt hàng 
 	+ tên mặt hàng
 	+ giá bán
 */
public class Item {

	// non-static: mỗi đối tượng trong Item sẽ có id, name, salesPrice riêng
	public int id;
	public String name;
	public double salesPrice;
	
    // Hàm "khởi tạo" mặc định
	// Khởi tạo một đối tượng cho class hiện tại
	// Trả về kiểu dử liệu Item
	
	public Item() {
		
	}
	
	public Item(int id, String name, double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}
	
	@Override // ( định nghĩa lại từ cha )
	// ctrl space -> select
	
	// i1.toString()
	// i2.toString()
	// i3.toString() => id=234
	// i4.toString() => id=345
	// this: biến đối tượng hiện tại đang gọi toString
	public String toString() {
		// TODO Auto-generated method stub
		return this.id +", " + this.name + ", " + this.salesPrice;	}
}
