package bean;

import java.time.LocalDate;

public class Store {
	private int id;
	private String name;
	private LocalDate startDate; //Ngày khai trương
	private int warehouseId; // Kho hàng của cửa hàng này. 
	
	public Store() {
	}
	
	public Store(int id, String name, LocalDate startDate, int warehouseId) {
		super();
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.warehouseId = warehouseId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public int getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", startDate=" + startDate + ", warehouseId=" + warehouseId + "]";
	}
	
	//Override lại hàm equals từ class Object
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Store)) {
			return false;
		}
		Store that = (Store)obj;
		return getId() == that.getId();
	}
	
}
