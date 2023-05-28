package bean;
public class Trader {
	private int id;
	private String name;
	private String city;

	// constructor reference
	// hàm khởi tạo ko được phép "return"
	// hàm khởi tạo => this.property
	// vì 1 lần khởi tạo ra => khởi tạo ô nhớ ở HEAP => trả về "this"
	// mỗi lần được this, sẽ sử dụng để gán cho giá trị bên ngoài
	public Trader(String line) {
		String[] elements = line.split(", ");
		if (elements.length == 3) {
			this.id = Integer.parseInt(elements[0]);
			this.name = elements[1];
			this.city = elements[2];
		}
	}

	// nên để ở class khác 
	// sau khi split trả về String[] -> từng phần tử đang là String 
	// --> cần convert sang kiểu tương ứng 
	// VD: id ==> convert sang Integer...

	// convert từng line sang từng Trader
	public static Trader transfer(String line) {
		Trader trader = null;
		String[] elements = line.split(", ");
		if (elements.length == 3) {
			trader = new Trader(Integer.parseInt(elements[0]), elements[1], elements[2]);
		}
		return trader;
	}

	public Trader(String name, String city) {
		this.name = name;
		this.city = city;
	}
	public Trader() {
	}

	public Trader(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
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