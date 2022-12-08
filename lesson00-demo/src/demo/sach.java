package demo;

public class sach {
	private String id;
	private String name;
	private double gia;
	public sach() {
	}
	public sach(String id, String name, double gia) {
		this.id = id;
		this.name = name;
		this.gia = gia;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	@Override
	public String toString() {
		return "sach [id=" + id + ", name=" + name + ", gia=" + gia + "]";
	}
	
	
	
	
}
