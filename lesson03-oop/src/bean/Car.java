package bean;

public class Car {
	//non-static: object scope -> mỗi thuộc tính sẽ lưu trữ ở 1 ô nhớ riêng cảu đối tượng
	private String id;
	private String color;
	//static: class scope -> Lưu trữ trong 1 ô nhớ chung của class, tất cả các dối tượng sẽ mang cùng 1 giá trị
	public static String model;
	public Car() {
		// TODO Auto-generated constructor stub
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
