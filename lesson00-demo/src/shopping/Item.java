package shopping;

public class Item {
	private String nameItem;
	private String id;
	private String origin;
	private int price;

	public Item() {
	}

	public Item(String nameItem, String id, String origin, int price) {

		this.nameItem = nameItem;
		this.id = id;
		this.origin = origin;
		this.price = price;
	}

	public String getNameItem() {
		return nameItem;
	}

	public void setNameItem(String nameItem) {
		this.nameItem = nameItem;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [nameItem=" + nameItem + ", id=" + id + ", origin=" + origin + ", price=" + price + "]";
	}
	
	
	
}
