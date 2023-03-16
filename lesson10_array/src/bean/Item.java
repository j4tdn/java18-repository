package bean;

import java.time.LocalDate;

public class Item implements Comparable<Item> {
	private int id;
	private String name;
	private double salesPrice;
	private LocalDate expiredDate;
	
	public Item() {
	}

	public Item(int id, String name, double salesPrice, LocalDate expiredDate) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.expiredDate = expiredDate;
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

	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(LocalDate expiredDate) {
		this.expiredDate = expiredDate;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", expiredDate=" + expiredDate
				+ "]\n";
	}

	@Override
	public int compareTo(Item o) {
		// default: asc
		// this.compareTo(o) > 0 --> swap
		Item i1 = this;
		Item i2 = o;
		
		// tăng dần theo salesPrice
		// swap(>0) nếu i1SalesPrice > i2SalesPrice
		
		/*if (i1.getSalesPrice() > i2.getSalesPrice()) {
			return 1;
		}
		if (i1.getSalesPrice() == i2.getSalesPrice()) {
			return 0;
		}
		return -1;*/
		// return Double.compare(i1.getSalesPrice(), i2.getSalesPrice());
		
		// giảm dần theo expiredDate
		/*if (i1.getExpiredDate().compareTo(i2.getExpiredDate()) > 0) {
			return -1;
		}
		
		if (i1.getExpiredDate().compareTo(i2.getExpiredDate()) < 0) {
			return 1;
		}
		
		return 0;*/
		
		// tăng dần theo expiredDate
		// nếu expiredDate = nhau thì giảm dần theo id
		// >>> expiredDate asc, id desc
		int expiredDateInt = i1.getExpiredDate().compareTo(i2.getExpiredDate());
		
		if (expiredDateInt == 0) {
			// so sánh tiếp id desc
			return i1.getId() - i2.getId();
		}
		
		return expiredDateInt;
	}
}
