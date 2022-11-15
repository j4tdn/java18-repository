package bean;

public class Car {
	private String id;
	
	// static --> class scope(pham vi)
	// luu tru trong 1 o nho chung cua class
	// tat ca cac doi tuong se mang gia tri chung do
	// co the xoa setter, getter va truy cap truc tiep
	public static String model;
	private String color;
	
	public Car() {
		
	}

	public Car(String id, String color) {
		this.id = id;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", color=" + color + "]";
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

}
