package dao;

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


	protected ItemGroupDto(Integer igId, String igName, Long amountOfItems, String itemList) {
		super();
		this.igId = igId;
		this.igName = igName;
		this.amountOfItems = amountOfItems;
		this.itemList = itemList;
	}


	public Integer getIgId() {
		return igId;
	}


	public void setIgId(Integer igId) {
		this.igId = igId;
	}


	public String getIgName() {
		return igName;
	}


	public void setIgName(String igName) {
		this.igName = igName;
	}


	public Long getAmountOfItems() {
		return amountOfItems;
	}


	public void setAmountOfItems(Long amountOfItems) {
		this.amountOfItems = amountOfItems;
	}


	public String getItemList() {
		return itemList;
	}


	public void setItemList(String itemList) {
		this.itemList = itemList;
	}


	@Override
	public String toString() {
		return "ItemGroupDto [igId=" + igId + ", igName=" + igName + ", amountOfItems=" + amountOfItems + ", itemList="
				+ itemList + "]";
	}
	

}