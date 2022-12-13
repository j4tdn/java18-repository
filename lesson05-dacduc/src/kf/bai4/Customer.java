package kf.bai4;

public class Customer {
	private String idCustomer;
	private String fullName;
	private int phoneNumber;
	private String address;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String idCustomer, String fullName, int phoneNumber, String address) {
		super();
		this.idCustomer = idCustomer;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
