package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="item_detail")
public class ItemDetail {
	@Id
	@Column(name="id")
	private Integer id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="item_id",referencedColumnName = "id")
	private Item item;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="size_id",referencedColumnName = "id")
	private Size size;
	@Column(name="amount")
	private Integer amount;
	@Column(name="buy_price")
	private Integer buyPrice;
	@Column(name="sell_price")
	private Integer sellPrice;
	public ItemDetail() {
		
	}
	public ItemDetail(Integer id, Item item, Size size, Integer amount, Integer buyPrice, Integer sellPrice) {
		super();
		this.id = id;
		this.item = item;
		this.size = size;
		this.amount = amount;
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(Integer buyPrice) {
		this.buyPrice = buyPrice;
	}
	public Integer getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(Integer sellPrice) {
		this.sellPrice = sellPrice;
	}
	@Override
	public String toString() {
		return "ItemDetail [id=" + id + ", item=" + item + ", size=" + size + ", amount=" + amount + ", buyPrice="
				+ buyPrice + ", sellPrice=" + sellPrice + "]";
	}
	
} 
