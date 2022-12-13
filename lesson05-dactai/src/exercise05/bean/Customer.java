package exercise05.bean;

public class Customer {
	private int id;
	private String name;
	private String phone;
	private String address;
	private TextBook[] textBooks;
	private ReferenceBook[] referenceBooks;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	

	public Customer(int id, String name, String phone, String address, TextBook[] textBooks,
			ReferenceBook[] referenceBooks) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.textBooks = textBooks;
		this.referenceBooks = referenceBooks;
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



	public TextBook[] getTextBooks() {
		return textBooks;
	}

	public void setTextBooks(TextBook[] textBooks) {
		this.textBooks = textBooks;
	}

	public ReferenceBook[] getReferenceBooks() {
		return referenceBooks;
	}

	public void setReferenceBooks(ReferenceBook[] referenceBooks) {
		this.referenceBooks = referenceBooks;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
	public double calPrice(Customer customer) {
		double priceOfTextBook = 0;
		double priceOfReferenceBook = 0;
		for(int i = 0; i < customer.getTextBooks().length; i++) {
			double price = 0;
			if(getTextBooks()[i].isStatus() == false) {
				price = (getTextBooks()[i].getSalesPrice() * 70)/100;
			} else {
				price = getTextBooks()[i].getSalesPrice();
			}
			priceOfTextBook += price;
		}
		
		for(int i = 0; i < customer.getReferenceBooks().length; i++) {
			priceOfReferenceBook += getReferenceBooks()[i].getSalesPrice() * (1 + getReferenceBooks()[i].getTax());
			}
		
		return priceOfReferenceBook + priceOfTextBook;
			
		}



		
	}
