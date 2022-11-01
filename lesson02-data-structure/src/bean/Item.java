package bean;
/*
 Khai báo kiểu dữ liệu Item (class)gồm
 	=> attributes(Thuộc tính)
 	+ mã mặt hàng
 	+tên mặt hàng
 	+ giá bán
 */

public class Item {
	public int id1;
	public String name;
	public double salesPrice;
	public int id;
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
		return super.toString();
	}

}
