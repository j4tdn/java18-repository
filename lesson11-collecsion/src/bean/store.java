package bean;

import java.time.LocalDate;

public class store {
	private int id;
	private String name;
	private LocalDate startedlocalDate;
	private int warehouseId;
	public store() {
	}
	public store(int id, String name, LocalDate startedlocalDate, int warehouseId) {
		this.id = id;
		this.name = name;
		this.startedlocalDate = startedlocalDate;
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
	public LocalDate getStartedlocalDate() {
		return startedlocalDate;
	}
	public void setStartedlocalDate(LocalDate startedlocalDate) {
		this.startedlocalDate = startedlocalDate;
	}
	public int getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}
	@Override
	public String toString() {
		return "store [id=" + id + ", name=" + name + ", startedlocalDate=" + startedlocalDate + ", warehouseId="
				+ warehouseId + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		if(!(obj instanceof store)) {
			return false;
		}
		store that = (store)obj;
		return getId()==that.getId();
	}
}
