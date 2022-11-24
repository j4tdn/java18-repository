package bean;

public class Car {
	// non-static: object scope
	// moi thuoc tinh se luu tru o 1 o nhow rieng cua doi tuong
	private String id;
	private String color;
	
	// static --> class scope(pham vi)
	// luu tru trong 1 o nho chung cua class
	// tat ca cac doi tuong se mang gia tri chung do
	public static String model;
	
	public Car() {
	}

	public Car(String id, String color) {
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

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", color=" + color + "]";
	}
}

