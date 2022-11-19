package bean;

public class device {
	private int id;
	private String operatingSystem;
	private String color;
	private double price;
	
	public device() {
		
	}

	public device(int id, String operatingSystem, String color, double price) {
		super();
		this.id = id;
		this.operatingSystem = operatingSystem;
		this.color = color;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "device [id=" + id + ", operatingSystem=" + operatingSystem + ", color=" + color + ", price=" + price
				+ "]";
	}
	
	
}
