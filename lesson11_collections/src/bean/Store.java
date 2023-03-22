package bean;

import java.time.LocalDate;

public class Store {
	private int id;
	private String name;
	private LocalDate startDate;
	private int warehouseId;
	
	public Store() {
		
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
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Store)) {
			return false;
		}
		
		Store that = (Store)o;
		return getId() == that.getId();
	}
	
	public Store(int id, String name, LocalDate startDate, int warehouseId) {
		super();
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.warehouseId = warehouseId;
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", startDate=" + startDate + ", warehouseId=" + warehouseId + "]";
	}
	
	
}
