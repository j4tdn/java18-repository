package shopping;

import java.util.Arrays;

public class OrderItem {
	private Customer customer;
	private ArrayItem[] arrayItems;
	private Item item;

	public OrderItem() {
		// TODO Auto-generated constructor stub
	}

	public OrderItem(Customer customer, ArrayItem[] arrayItems, Item item) {
		this.customer = customer;
		this.arrayItems = arrayItems;
		this.item = item;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ArrayItem[] getArrayItems() {
		return arrayItems;
	}

	public void setArrayItems(ArrayItem[] arrayItems) {
		this.arrayItems = arrayItems;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "OrderItem [customer=" + customer + ", arrayItems=" + Arrays.toString(arrayItems) + ", item=" + item
				+ "]";
	}
	
}
