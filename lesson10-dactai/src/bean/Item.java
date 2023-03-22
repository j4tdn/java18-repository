package bean;

public class Item {
	private int itemId;
	private String name;
	private double salesprice;
	private int storeId;
	public Item(int itemId, String name, double salesprice, int storeId) {
		this.itemId = itemId;
		this.name = name;
		this.salesprice = salesprice;
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
	public double getSalesprice() {
		return salesprice;
	}
	public void setSalesprice(double salesprice) {
		this.salesprice = salesprice;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", salesprice=" + salesprice + ", storeId=" + storeId
				+ "]";
	}
	
	
}
