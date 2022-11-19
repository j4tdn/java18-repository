package bean;

public class Customer {
	private String name;
	private int phoneNumber;
	private int id;
	private String address;
	
	public Customer() {
		
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Customer(String name, int phoneNumber, int id, String address) {

		this.name = name;
		this.phoneNumber = phoneNumber;
		this.id = id;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", phoneNumber=" + phoneNumber + ", id=" + id + ", address=" + address + "]";
	}
	
	
}
