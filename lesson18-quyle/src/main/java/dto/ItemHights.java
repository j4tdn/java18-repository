package dto;

public class ItemHights {
	public static final String idd = "id";
	public static final String nameee = "namee";
	public static final String amountt = "amount";

	private Integer id;
	private String namee;
	private Integer amount;
	
	public ItemHights() {
		// TODO Auto-generated constructor stub
	}

	public ItemHights(Integer id, String namee, Integer amount) {
		this.id = id;
		this.namee = namee;
		this.amount = amount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNamee() {
		return namee;
	}

	public void setNamee(String namee) {
		this.namee = namee;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ItemHights [id=" + id + ", namee=" + namee + ", amount=" + amount + "]";
	}
	
	
}
