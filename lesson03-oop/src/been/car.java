package been;

public class car { 
	// non-static : object scope
	// mỗi thuộc tính sẽ lưu trữ ở 1 ô nhớ riêng của đối tượng
	 private String id;
	 private String color;
	 
	 // static --> class scope(phạm vị)
	 // lưu trữ trong 1 ô nhớ chung của class
	 // tất cả các đối tượng sẽ mang giá trị chung đó
	 public  static String model;
	 
	 
	 public car() {
		
	}

	public car(String id,  String color) {
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
		return "car [id=" + id + ", model=" + model + ", color=" + color + "]";
	}
	 
}
