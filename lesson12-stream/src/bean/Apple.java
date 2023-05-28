package bean;

import java.util.Objects;

public class Apple {
	private int id;
	private String color;
	private Double weight;
	private String country;
	
	public Apple() {
		// TODO Auto-generated constructor stub
	}

	public Apple(int id, String color, Double weight, String country) {
		this.id = id;
		this.color = color;
		this.weight = weight;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Apple [id=" + id + ", color=" + color + ", weight=" + weight + ", country=" + country + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(!(o instanceof Apple)) {
			return false;
		}
		
		Apple that =(Apple)o;
		
		return getId()==that.getId();
	}
	
	
	
	
}