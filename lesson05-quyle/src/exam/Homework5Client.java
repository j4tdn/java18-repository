package exam;

public class Homework5Client {
	private String codeClient;
	private String name;
	private String phoneNumber;
	private String Origin;

	public Homework5Client() {
		// TODO Auto-generated constructor stub
	}

	public Homework5Client(String codeClient, String name, String phoneNumber, String origin) {
		this.codeClient = codeClient;
		this.name = name;
		this.phoneNumber = phoneNumber;
		Origin = origin;
	}

	public String getCodeClient() {
		return codeClient;
	}

	public void setCodeClient(String codeClient) {
		this.codeClient = codeClient;
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

	public String getOrigin() {
		return Origin;
	}

	public void setOrigin(String origin) {
		Origin = origin;
	}

	@Override
	public String toString() {
		return "Homework5Client [codeClient=" + codeClient + ", name=" + name + ", phoneNumber=" + phoneNumber
				+ ", Origin=" + Origin + "]";
	}
	
	
}
