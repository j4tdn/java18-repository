package infor;

public class Customer {
	private String idCustomer;
	private String nameCustomer;
	private String phoneNumber;
	private String address;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String idCustomer, String nameCustomer, String phoneNumber, String address) {
		this.idCustomer = idCustomer;
		this.nameCustomer = nameCustomer;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
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
		return "Customer [idCustomer=" + idCustomer + ", nameCustomer=" + nameCustomer + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + "]";
	}

	
}
