package homework;

public class Item {
	private int itemID;
	private String name;
	private int salesPrice;
	private int storeId;
	
	public Item() {
	}

	public Item(int itemID, String name, int salesPrice, int storeId) {
		this.itemID = itemID;
		this.name = name;
		this.salesPrice = salesPrice;
		this.storeId = storeId;
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

	public int getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(int salesPrice) {
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
		return "itemID=" + itemID + ", name=" + name + ", salesPrice=" + salesPrice + ", storeId=" + storeId;
	}
}
