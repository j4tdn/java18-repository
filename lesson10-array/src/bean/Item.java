package bean;

import java.time.LocalDate;

public class Item implements Comparable<Item> {
	private int id;
	private String name;
	private double salesPrice;
	private LocalDate expired;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int id, String name, double salesPrice, LocalDate expired) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.expired = expired;
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

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public LocalDate getExpired() {
		return expired;
	}

	public void setExpired(LocalDate expired) {
		this.expired = expired;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", expired=" + expired + "]";
	}
	
	@Override
	public int compareTo(Item o) {
		return this.getName().compareTo(o.getName());
	}
}
