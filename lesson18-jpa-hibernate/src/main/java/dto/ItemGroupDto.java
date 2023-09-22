package dto;

public class ItemGroupDto {
	
	public static final String PROP_IG_ID = "igId";
	public static final String PROP_IG_NAME = "igName";
	public static final String PROP_AMOUNT_OF_ITEMS = "amountOfItems";
	public static final String PROP_ITEM_LIST = "itemList";
	
	private Integer igId;
	private String igName;
	private Long amountOfItems;
	private String itemList;

	public ItemGroupDto() {
	}

	public ItemGroupDto(Integer igId, String igName, Long amountOfItems, String itemList) {
		this.igId = igId;
		this.igName = igName;
		this.amountOfItems = amountOfItems;
		this.itemList = itemList;
	}

	public static ItemGroupDto of() {
		return new ItemGroupDto();
	}

	public Integer getIgId() {
		return igId;
	}

	public ItemGroupDto withIgId(Integer igId) {
		this.igId = igId;
		return this;
	}

	public String getIgName() {
		return igName;
	}

	public ItemGroupDto withIgName(String igName) {
		this.igName = igName;
		return this;
	}

	public Long getAmountOfItems() {
		return amountOfItems;
	}

	public ItemGroupDto withAmountOfItems(Long amountOfItems) {
		this.amountOfItems = amountOfItems;
		return this;
	}

	public String getItemList() {
		return itemList;
	}

	public ItemGroupDto withItemList(String itemList) {
		this.itemList = itemList;
		return this;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [" + "\nigId=" + igId + ", igName=" + igName + ", amountOfItems=" + amountOfItems
				+ ", itemList=" + itemList + "]";
	}
}
