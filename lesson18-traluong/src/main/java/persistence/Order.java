package persistence;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "`order`")
public class Order {
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "DELIVERY_ADDRESS")
	private String deliveryAddress;
	
	@Column(name = "TOTAL_FEE")
	private double totalFee;
	
	@Column(name = "DELIVERY_DATE")
	private LocalDate deliveryDate;
	
	@Column(name = "DELIVERY_FEE")
	private double deliveryFee;
	
	@Column(name = "CREATED_AT")
	private LocalDateTime createdAt;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Integer id, String deliveryAddress, double totalFee, LocalDate deliveryDate, double deliveryFee,
			LocalDateTime createdAt) {
		super();
		this.id = id;
		this.deliveryAddress = deliveryAddress;
		this.totalFee = totalFee;
		this.deliveryDate = deliveryDate;
		this.deliveryFee = deliveryFee;
		this.createdAt = createdAt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public double getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(double totalFee) {
		this.totalFee = totalFee;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public double getDeliveryFee() {
		return deliveryFee;
	}

	public void setDeliveryFee(double deliveryFee) {
		this.deliveryFee = deliveryFee;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", deliveryAddress=" + deliveryAddress + ", totalFee=" + totalFee + ", deliveryDate="
				+ deliveryDate + ", deliveryFee=" + deliveryFee + ", createdAt=" + createdAt + "]";
	}
	
	
	
}
