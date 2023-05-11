package bean;

import java.util.Objects;

public class Apple {

	private int id;
	private String color;
	private double weight;
	private String country;

	public Apple() {
	}

	public Apple(int id) {
		this.id = id;
	}

	public Apple(String country) {
		this.country = country;
	}

	public Apple(int id, String country) {
		this.id = id;
		this.country = country;
	}

	public Apple(int id, String color, double weight, String country) {
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(country);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Apple)) {
			return false;
		}
		Apple that = (Apple)obj;
		return getCountry().equals(that.country);
	}

	@Override
	public String toString() {
		return "Apple [id=" + id + ", color=" + color + ", weight=" + weight + ", country=" + country + "]";
	}
}
