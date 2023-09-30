package persistence;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER")
public class Order {
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "DELIVERY_ADDRESS")
	private String deliveryAddres;
	
	@Column(name = "TOTAL_FEE")
	private Double totatFee;
	
	@Column(name = "CREATE_AT")
	private Date createAt;
	
	public Order() {
	}

	public Order(Integer id, String deliveryAddres, Double totatFree, Date createAt) {
		super();
		this.id = id;
		this.deliveryAddres = deliveryAddres;
		this.totatFee = totatFree;
		this.createAt = createAt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDeliveryAddres() {
		return deliveryAddres;
	}

	public void setDeliveryAddres(String deliveryAddres) {
		this.deliveryAddres = deliveryAddres;
	}

	public Double getTotatFree() {
		return totatFee;
	}

	public void setTotatFree(Double totatFree) {
		this.totatFee = totatFree;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", deliveryAddres=" + deliveryAddres + ", totatFree=" + totatFee + ", createAt="
				+ createAt + "]";
	}
	

}
