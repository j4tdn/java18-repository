package bean;

import java.time.LocalDate;

public class Store {
	private int id;
	private String name;
	private LocalDate startedDate;			// ngày bắt đầu
	private int warahouseId; // kho hàng của của hàng này

	public Store() {

	}

	public Store(int id, String name, LocalDate startedDate, int warahouseId) {
		this.id = id;
		this.name = name;
		this.startedDate = startedDate;
		this.warahouseId = warahouseId;
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

	public int getWarahouseId() {
		return warahouseId;
	}

	public void setWarahouseId(int warahouseId) {
		this.warahouseId = warahouseId;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Store)) {
			return false;
		}
		Store that = (Store) obj;
		return getId() == that.getId();
	}
	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", startedDate=" + startedDate + ", warahouseId=" + warahouseId
				+ "]";
	}
	
}
