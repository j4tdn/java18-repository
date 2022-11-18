package Ex02Shopping;

import java.time.LocalDate;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemDetail;
	private LocalDate orderDate;
	public Order() {
		
	}
	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDetail=" + Arrays.toString(itemDetail) + ", orderDateTime="
				+ orderDate + "]";
	}
	public Order(Customer customer, ItemDetail[] itemDetail2, LocalDate orderDate) {
		this.customer = customer;
		this.itemDetail = itemDetail2;
		this.orderDate = orderDate;
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
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	
	public double export() {
		double total = 0;
		for(ItemDetail id : this.itemDetail) {
			total += id.getItem().getPrice()*id.getQuatity();
			if (LocalDate.of(2022, 5, 5).isEqual(getOrderDate()) && id.getItem().getPrice() >= 590000) {
				
				total = total - (id.getItem().getPrice()*id.getQuatity()*10)/100;
			}
		}
		return total;
	}

}
