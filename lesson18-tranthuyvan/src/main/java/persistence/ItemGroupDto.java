package persistence;

public class ItemGroupDto {
	
	public static final String PROP_IG_ID = "id";
	public static final String PROP_IG_NAME = "name";
	public static final String PROP_AMOUNT_OF_ITEMS = "amountOfItems";	
	
	private Integer id;
	private String name;
	private Long amountOfItems;

	public ItemGroupDto() {
	}

	public ItemGroupDto(Integer id, String name, String itemList, Long amountOfItems) {
		this.id = id;
		this.name = name;
		this.amountOfItems = amountOfItems;
	}

	public static ItemGroupDto of() {
		return new ItemGroupDto();
	}

	public Integer getId() {
		return id;
	}

	public ItemGroupDto withId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public ItemGroupDto withName(String name) {
		this.name = name;
		return this;
	}

	public Long getAmountOfItems() {
		return amountOfItems;
	}

	public ItemGroupDto withAmountOfItems(Long amountOfItems) {
		this.amountOfItems = amountOfItems;
		return this;
	}

	@Override
	public String toString() {
		return "ItemGroupDto\n {id=" + id + ", name=" + name + ", amountOfItems=" + amountOfItems + "}\n";
	}

}
