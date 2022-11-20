package bean;

public class Item {
	public int itemID;
	public String name;
	public double price;
	
	//hàm khởi tạo rỗng mặc định
	//tạo ra ô nhớ ở heap với giá trị mặc đình của các thuộc tính
	//chưa gán giá trị cho thuộc tính
	public Item() {
		//sẽ mất đi khi mình thêm hàm khởi tạo khác vào
	}
	
	public Item(int itemIdPr, String namePr, double pricePr) {
		this.itemID = itemIdPr;
		this.name = namePr;
		this.price = pricePr;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemID=" + itemID + ", name=" + name + ", price=" + price + "]";
	}
	
	

	  
}
