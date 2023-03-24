package bean;

public class Item {
	private int itemId;
	private String name;
	private int salesPricel;
	private int storeId;
	public Item(int itemId, String name, int salesPricel, int storeId) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.salesPricel = salesPricel;
		this.storeId = storeId;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
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
	public double getSalesPricel() {
		return salesPricel;
	}
	public void setSalesPricel(int salesPricel) {
		this.salesPricel = salesPricel;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", salesPricel=" + salesPricel + ", storeId=" + storeId
				+ "]";
	}
	
	
}
