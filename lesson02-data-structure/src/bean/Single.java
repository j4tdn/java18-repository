package bean;

public class Single {
	// các thuộc tính non-static được khởi tạo
	// khi tạo ra đối tượng ở ô nhớ trên heap
	public int value;

	public Single() {

	}

	public Single(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "" + this.value;
	}

}
