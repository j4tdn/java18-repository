package bean;

public class Trader {
	private int ID;
	private String name;
	private String city;
	
	public Trader() {
		// TODO Auto-generated constructor stub
	}

	public Trader(int ID,String name, String city) {
		this.ID = ID;
		this.name = name;
		this.city = city;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Trader [ID=" + ID + ", name=" + name + ", city=" + city + "]";
	}

	
	
	
}
