package bean;

import java.time.LocalDate;

public class Store {
	private int id;
	private String name;
	private LocalDate startedDate; // ngày khai trương
	private int warehouseId; // kho hàng của cửa hàng này

	public Store() {
	}

	public Store(int id, String name, LocalDate startedDate, int warehouseId) {
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
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Store)) {
			return false;
		}
		Store that = (Store) o;
		return getId() == that.getId();
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", startedDate=" + startedDate + ", warehouseId=" + warehouseId
				+ "]";
	}
}