package bean;

public class Rectangle {
	// attribute

	// khi tạo ra 1 object(giá trị của class)

	// non-static ==> object
	// static ==> class(object)
	private int width;
	private int height;

	public Rectangle() {

	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(Rectangle rec) {
		this.width = rec.getWidth();
		this.height = rec.getHeight();
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWidth() {
		return this.width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return this.height;
	}

	@Override
	public String toString() {
		return "width = " + this.width + ", height = " + this.height;
	}
}
