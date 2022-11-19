package lesson03.ex03;

public class Customer {
	private String name;
	private int old;
	
	public Customer(String name, int old) {
		this.name = name;
		this.old = old;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", old=" + old + "]";
	}
}
