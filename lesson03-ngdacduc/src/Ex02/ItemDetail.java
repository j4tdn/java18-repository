package Ex02;

public class ItemDetail {
	private Item item;
	private int quatity;

	public ItemDetail() {

	}

	@Override
	public String toString() {
		return "ItemDetail [item=" + item + ", quatity=" + quatity + "]";
	}

	public ItemDetail(Item item, int quatity) {
		this.item = item;
		this.quatity = quatity;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuatity() {
		return quatity;
	}

	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}

}
