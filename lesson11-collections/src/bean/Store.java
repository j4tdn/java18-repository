package bean;

import java.time.LocalDate;

public class Store {
	private int id;
	private String name;
	private LocalDate startedDate; // ngày khai trương
	private int wareHouseId; // kho hàng của cửa hàng
	
	public Store() {
		// TODO Auto-generated constructor stub
	}

	public Store(int id, String name, LocalDate startedDate, int wareHouseId) {
		this.id = id;
		this.name = name;
		this.startedDate = startedDate;
		this.wareHouseId = wareHouseId;
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

	public int getWareHouseId() {
		return wareHouseId;
	}

	public void setWareHouseId(int wareHouseId) {
		this.wareHouseId = wareHouseId;
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", startedDate=" + startedDate + ", wareHouseId=" + wareHouseId
				+ "]";
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
}
