package bean;

public class Car {
	// static se luu tru trong 1 o nho chung cua class
	// tat ca cac doi tuong se mang gia tri chung do

	private String id;
	public static String model;
	private String color;

	public Car() {
	}

	public Car(String id, String color) {
		super();
		this.id = id;
		this.color = color;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", color=" + color + "]";
	}

}
