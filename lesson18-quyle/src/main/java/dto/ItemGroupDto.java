package dto;

public class ItemGroupDto {
	
	public static final String idd = "id";
	public static final String nameee = "namee";
	public static final String amount_of_itemss = "amount_of_items";

	private Integer id;
	private String namee;
	private Integer amount_of_items;
	
	public ItemGroupDto() {
		// TODO Auto-generated constructor stub
	}

	public ItemGroupDto(Integer id, String name, Integer amount_of_items) {
		this.id = id;
		this.namee = name;
		this.amount_of_items = amount_of_items;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return namee;
	}

	public void setName(String name) {
		this.namee = name;
	}

	public Integer getAMOUNT_OF_ITEMS() {
		return amount_of_items;
	}

	public void setAMOUNT_OF_ITEMS(Integer aMOUNT_OF_ITEMS) {
		amount_of_items = aMOUNT_OF_ITEMS;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [id=" + id + ", name=" + namee + ", AMOUNT_OF_ITEMS=" + amount_of_items + "]";
	}
	
	
}
