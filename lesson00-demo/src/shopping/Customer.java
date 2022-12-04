package shopping;

public class Customer {
	private String name;
	private String id;
	private String origin;
	private int old;

	public Customer() {
	}

	public Customer(String name, String id, String origin, int old) {
		this.name = name;
		this.id = id;
		this.origin = origin;
		this.old = old;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}

	@Override
	public String toString() {
		return "customer [name=" + name + ", id=" + id + ", origin=" + origin + ", old=" + old + "]";
	}
	
	
	
	

}
