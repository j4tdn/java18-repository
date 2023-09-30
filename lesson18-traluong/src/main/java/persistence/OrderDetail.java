package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_detail")
public class OrderDetail {
	
	@Column(name = "ORDER_ID")
	@OneToOne
	@JoinColumn(name = "ID")
	private Order order;
	
	@Id
	@Column(name = "ITEM_DETAIL_ID")
	@OneToMany( mappedBy = "OrderDetail",fetch = FetchType.LAZY)
	private ItemDetail itemDetail;
	
	@Column(name = "AMOUNT")
	private Integer amount;
	
	public OrderDetail() {
	}

	public OrderDetail(Order order, ItemDetail itemDetail, Integer amount) {
		super();
		this.order = order;
		this.itemDetail = itemDetail;
		this.amount = amount;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public ItemDetail getItemDetail() {
		return itemDetail;
	}

	public void setItemDetail(ItemDetail itemDetail) {
		this.itemDetail = itemDetail;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "OrderDetail [order=" + order + ", itemDetail=" + itemDetail + ", amount=" + amount + "]";
	}

	
	
}
