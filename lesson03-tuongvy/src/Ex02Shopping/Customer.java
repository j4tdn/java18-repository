package Ex02Shopping;


public class Customer {
	private String name;
	private String phoneNumber;
	private String CMND;
	private String address;
	
	public Customer() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCMND() {
		return CMND;
	}
	public void setCMND(String cMND) {
		CMND = cMND;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", phoneNumber=" + phoneNumber + ", CMND=" + CMND + ", address=" + address
				+ "]";
	}
	public Customer(String name, String phoneNumber, String cMND, String address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		CMND = cMND;
		this.address = address;
	}
	
}
