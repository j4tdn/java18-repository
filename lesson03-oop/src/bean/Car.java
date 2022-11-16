package bean;

public class Car {
	// non-static : object scope
	// moi thuoc tinh se luu tru o 1 o nho rieng cua doi tuong
	private String id;
	private String color;
	
	// static --> class scope
	// lưu trữ trong 1 ô nhớ chung của class
	// tất cả các đối tượng sẽ mang giá trị chung đó
	// có thể xóa getter, setter và truy cập trực tiếp
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
