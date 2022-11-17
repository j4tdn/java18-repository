package bean;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemDetail;
	private LocalDateTime orderDate; // lưu ngày tháng năm giờ phút giây

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Customer customer, ItemDetail[] itemDetail, LocalDateTime orderDate) {
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

}
