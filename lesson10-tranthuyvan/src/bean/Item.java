package bean;

public class Item {
	private int storeId;
	private int itemId;
	private String name;
	private double salesPrice;

	public Item() {
	}

	public Item(int storeId, int itemId, String name, double salesPrice) {
		this.storeId = storeId;
		this.itemId = itemId;
		this.name = name;
		this.salesPrice = salesPrice;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
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

	@Override
	public String toString() {
		return "Item [storeId=" + storeId + ", itemId=" + itemId + ", name=" + name + ", salesPrice=" + salesPrice
				+ "]\n";
	}
}