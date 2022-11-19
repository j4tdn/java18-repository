package ex02shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemDetail;
	private LocalDateTime orderDate;
	
	public Order() {
	}

	public Order(Customer customer, ItemDetail[] itemDetail, LocalDateTime orderDate) {
		super();
		this.customer = customer;
		this.itemDetail = itemDetail;
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

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDetail=" + Arrays.toString(itemDetail) + ", orderDate="
				+ orderDate + "]";
	}

	public double export() {
		double total = 0;
		for(ItemDetail id : this.itemDetail) {
			total = total + id.getItem().getPrice()*id.getQuantity();
		}
		if(LocalDate.of(2022, Month.NOVEMBER, 17).isEqual(getOrderDate().toLocalDate())
				&& total >= 590) {
			total = total - (total*10)/100;
		}
		return total;
	}

}

