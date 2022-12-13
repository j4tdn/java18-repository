package ex04bookmanagement;

import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemDetail;
	
	public Order() {
	}

	public Order(Customer customer, ItemDetail[] itemDetail) {
		super();
		this.customer = customer;
		this.itemDetail = itemDetail;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemDetail[] getItemDetail() {
		return itemDetail;
	}

	public void setItemDetail(ItemDetail[] itemDetail) {
		this.itemDetail = itemDetail;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDetail=" + Arrays.toString(itemDetail) + "]";
	}
	
	public double export() {
		double total = 0;
		for(ItemDetail id : this.itemDetail) {
			total = total + id.getBook().calPrice()*id.getQuantity();
		}
		return total;
	}
}
