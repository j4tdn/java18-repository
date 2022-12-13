package exercise05;

public class Customer {
	private int mkh;
	private String namectm;
	private String phone;
	private String address;
	
	public Customer() {
	}

	public Customer(int mkh, String namectm, String phone, String address) {
		this.mkh = mkh;
		this.namectm = namectm;
		this.phone = phone;
		this.address = address;
	}

	public int getMkh() {
		return mkh;
	}

	public void setMkh(int mkh) {
		this.mkh = mkh;
	}

	public String getNamectm() {
		return namectm;
	}

	public void setNamectm(String namectm) {
		this.namectm = namectm;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [mkh=" + mkh + ", namectm=" + namectm + ", phone=" + phone + ", address=" + address + "]";
	}
}
