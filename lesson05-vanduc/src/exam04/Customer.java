package exam04;

public class Customer {

	public int id;
	public String name;
	public float telephone;
	public String address;

	public Customer() {
	}

	public Customer(int id, String name, float telephone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.telephone = telephone;
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

	public float getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer []";
	}

}
