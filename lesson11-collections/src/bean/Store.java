package bean;

import java.time.LocalDate;

public class Store {
	private int id;
	private String name;
	private LocalDate startedDate;
	private int warehouseId;
	public Store(int id, String name, LocalDate startedDate, int warehouseId) {
		super();
		this.id = id;
		this.name = name;
		this.startedDate = startedDate;
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
	public LocalDate getStartedDate() {
		return startedDate;
	}
	public void setStartedDate(LocalDate startedDate) {
		this.startedDate = startedDate;
	}
	public int getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Store)) {
			return false;
		}
		Store that = (Store)obj;
		return getId() == that.getId();
	}
	
	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", startedDate=" + startedDate + ", warehouseId=" + warehouseId
				+ "]";
	}

}
