package bean;

public class Item {
	// mã mặt hàng, tên mặt hàng, giá bán, mã cửa hàng
	private int itemId;
	private String name;
	private double salesPrice;
	private int storeId;

	public Item() {
	}

	public Item(int id, String name, double salesPrice, int idStore) {
		this.itemId = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.storeId = idStore;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", salesPrice=" + salesPrice + ", storeId=" + storeId
				+ "]";
	}

}
