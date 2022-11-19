package bean;

public class Car {
	// NON-STATIC: object scope
	// Mỗi thuộc tính sẽ lưu trữ ở 1 ô nhớ riêng của đối tượng
	private String id;
	public static String model;
	private String color;

	// static --> class scope(phạm vi)
	//

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

	public String getModel() {
		return model;
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
