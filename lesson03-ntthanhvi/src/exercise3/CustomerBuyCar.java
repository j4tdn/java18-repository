package exercise3;

public class CustomerBuyCar {
	private String name;
	
	public CustomerBuyCar() {
		// TODO Auto-generated constructor stub
	}

	public CustomerBuyCar(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + "]";
	}
	
	
}
