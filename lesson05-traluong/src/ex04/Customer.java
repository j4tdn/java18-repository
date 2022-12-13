package ex04;

public class Customer {
	private int id;
	private String name;
	private long phoneNumber;
	private String address;
	public Customer() {
	}
	public Customer(int id, String name, long phoneNumber, String address) {
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
	
	
	
}
