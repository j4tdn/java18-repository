package bean;

public class Trader {
	private String name;
	private String city;

	public Trader() {
	}
	
	public Trader(String line) {
		String[] elements = line.split(", ");
		if (elements.length == 2) {
			this.name = elements[0];
			this.city = elements[1];
		}
	}

	public Trader(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}
}