package bean;

import java.time.LocalDate;

public class Item {
	private int id ;
	private String name ;
	private LocalDate date ;
	private int warehouseId ;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public Item(int id, String name, LocalDate date, int warehouseId) {
		this.id = id;
		this.name = name;
		this.date = date;
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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", date=" + date + ", warehouseId=" + warehouseId + "]";
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(!(o instanceof Item)) {
			return false;
		}
		Item that = (Item) o;
		return this.getId() == that.getId(); 
	}
}
