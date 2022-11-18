package excersises;


public class Item {
	// attribute - thuộc tính
	// --> thông tin của class chứa nó
	
	// tạo ra Object thông qua hàm khởi tạo -> tạo ra 1 ô nhớ ở HEAP
	// chứa giá trị mặc định (id, name, salesPrice,...) của thuộc tính class
	private int id;
	private String name; 
	private double salesPrice;
	private String origin;
	private int setid;
	
	// hàm khởi tạo rỗng --> tạo ra đối tượng(giá trị) cho biến 
	// thuộc KDL class Item --> new
	public Item() {
		
	}
	// tạo ra ô nhớ và gán giá trị cho các thuộc tính của
	// đối tượng - với tham số truyền bên ngoài vào
	public Item(int id,String name, double salsePrice, String origin) {
		this.id = id;
		this.name = name;
		this.salesPrice = salsePrice;
		this.origin = origin;
	}

		//////////////////////////

	public void setid(int id) {
		this.id = id;
	}
	public int getid() {
		return this.id;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	public String getname() {
		return this.getname();
	}
	
	public void setsalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}
	public double getsalseprice() {
		return this.salesPrice;
	}
	public void  setorigin(String origin) {
		this.origin = origin;
	}
	
	public String getorigin (){
		return this.origin;
	}
	
	
	
	// i1.toString(), r2.toString()
	// this --> biến(đối tượng) hiện tại đang gọi function
	@Override
	public String toString() {
		return "id: " + this.id + ", " + "name: " + this.name + ", " + "salesPrice: " + this.salesPrice + ", " + "origin: " + this.origin;
	}
}
