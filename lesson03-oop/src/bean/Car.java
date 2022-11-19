package bean;

public class Car {
	//non-static: object scope
	//Mỗi thuộc tính lưu trữ ở 1 ô nhớ riêng của 1 đối tượng
	private String id;
	private String color;

	//static: class scope
	//Lưu trữ trong ô nhớ chung của class
	//Tất cả các đối tượng sẽ mang giá trị chung đó
	public static String model;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String id,  String color) {
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
