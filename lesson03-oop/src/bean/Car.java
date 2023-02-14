package bean;

public class Car {
	// non-static --> object scope
	// Mỗi thuộc tính sẽ lưu trữ ở một ô nhớ riêng của đối tượng 
	private String id;
	private String color;
	
	// static --> class scope
	// Lưu trữ trong một ô nhớ chung của Class 
	// Tất cả các đối tượng sẽ mang giá trị chung đó
	// Có thể xóa getter, setter và truy cập trực tiếp thông qua Class
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
