package bean;

//Khai báo kiểu dữ liệu Item gồm 
//mã mặt hàng, tên mặt hàng, giá -> thuộc tính
public class Item {
	//non-static
	public int id;
	public String itemName;
	public double cost;
	
	//Contructor
	// => Trả về KDL Item
	public Item(int id, String itemName, double cost) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return this.id +", "+this.itemName+", "+this.cost;
	}
	
	
}
