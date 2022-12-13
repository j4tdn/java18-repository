package bean;

public class Customer {
	private int id;
	private String name;
	private int phoneN;
	private String address;
	
	public Customer() {
		
	}

	public Customer(int id, String name, int phoneN, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phoneN = phoneN;
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

	public int getPhoneN() {
		return phoneN;
	}

	public void setPhoneN(int phoneN) {
		this.phoneN = phoneN;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phoneN=" + phoneN + ", address=" + address + "]";
	}
	
	
}
