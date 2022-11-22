package bean;

//non static : mỗi thuộc tính sễ lưu trũ ở 1 ô nhiws riêng cảu đối tượng
//static : lưu trũ 1 ô nhớ chung của class tất cả các đối tượng sẽ mang giá trị chung đó 
//có thể xóa getter , setter
public class Car {
	private String id;
	private String color;

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
